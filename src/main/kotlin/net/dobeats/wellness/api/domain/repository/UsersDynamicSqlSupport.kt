/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2022-01-10T22:21:44.920181+09:00
 */
package net.dobeats.wellness.api.domain.repository

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object UsersDynamicSqlSupport {
    object Users : SqlTable("users") {
        val id = column<Int>("id", JDBCType.INTEGER)

        val name = column<String>("name", JDBCType.VARCHAR)

        val age = column<Int>("age", JDBCType.INTEGER)

        val sex = column<Byte>("sex", JDBCType.TINYINT)
    }
}