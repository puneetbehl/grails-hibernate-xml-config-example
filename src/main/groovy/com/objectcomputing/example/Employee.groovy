package com.objectcomputing.example

import grails.persistence.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Employee implements GormEntity<Employee> {
    Integer id
    String firstName
    String lastName
    Double salary
}
