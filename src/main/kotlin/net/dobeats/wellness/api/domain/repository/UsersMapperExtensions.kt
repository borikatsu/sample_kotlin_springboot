/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2022-01-10T22:21:44.926704+09:00
 */
package net.dobeats.wellness.api.domain.repository

import net.dobeats.wellness.api.domain.model.UsersRecord
import net.dobeats.wellness.api.domain.repository.UsersDynamicSqlSupport.Users
import net.dobeats.wellness.api.domain.repository.UsersDynamicSqlSupport.Users.age
import net.dobeats.wellness.api.domain.repository.UsersDynamicSqlSupport.Users.id
import net.dobeats.wellness.api.domain.repository.UsersDynamicSqlSupport.Users.name
import net.dobeats.wellness.api.domain.repository.UsersDynamicSqlSupport.Users.sex
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun UsersMapper.count(completer: CountCompleter) =
    countFrom(this::count, Users, completer)

fun UsersMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, Users, completer)

fun UsersMapper.deleteByPrimaryKey(id_: Int) =
    delete {
        where(id, isEqualTo(id_))
    }

fun UsersMapper.insert(record: UsersRecord) =
    insert(this::insert, record, Users) {
        map(id).toProperty("id")
        map(name).toProperty("name")
        map(age).toProperty("age")
        map(sex).toProperty("sex")
    }

fun UsersMapper.insertMultiple(records: Collection<UsersRecord>) =
    insertMultiple(this::insertMultiple, records, Users) {
        map(id).toProperty("id")
        map(name).toProperty("name")
        map(age).toProperty("age")
        map(sex).toProperty("sex")
    }

fun UsersMapper.insertMultiple(vararg records: UsersRecord) =
    insertMultiple(records.toList())

fun UsersMapper.insertSelective(record: UsersRecord) =
    insert(this::insert, record, Users) {
        map(id).toPropertyWhenPresent("id", record::id)
        map(name).toPropertyWhenPresent("name", record::name)
        map(age).toPropertyWhenPresent("age", record::age)
        map(sex).toPropertyWhenPresent("sex", record::sex)
    }

private val columnList = listOf(id, name, age, sex)

fun UsersMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, Users, completer)

fun UsersMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, Users, completer)

fun UsersMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, Users, completer)

fun UsersMapper.selectByPrimaryKey(id_: Int) =
    selectOne {
        where(id, isEqualTo(id_))
    }

fun UsersMapper.update(completer: UpdateCompleter) =
    update(this::update, Users, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: UsersRecord) =
    apply {
        set(id).equalTo(record::id)
        set(name).equalTo(record::name)
        set(age).equalTo(record::age)
        set(sex).equalTo(record::sex)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: UsersRecord) =
    apply {
        set(id).equalToWhenPresent(record::id)
        set(name).equalToWhenPresent(record::name)
        set(age).equalToWhenPresent(record::age)
        set(sex).equalToWhenPresent(record::sex)
    }

fun UsersMapper.updateByPrimaryKey(record: UsersRecord) =
    update {
        set(name).equalTo(record::name)
        set(age).equalTo(record::age)
        set(sex).equalTo(record::sex)
        where(id, isEqualTo(record::id))
    }

fun UsersMapper.updateByPrimaryKeySelective(record: UsersRecord) =
    update {
        set(name).equalToWhenPresent(record::name)
        set(age).equalToWhenPresent(record::age)
        set(sex).equalToWhenPresent(record::sex)
        where(id, isEqualTo(record::id))
    }