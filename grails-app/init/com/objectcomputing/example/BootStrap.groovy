package com.objectcomputing.example

class BootStrap {

    EmployeeService employeeService

    def init = { servletContext ->

        if (employeeService.count() == 0) {
            employeeService.save("John", "Doe", 111111111.11D)
        }
    }
    def destroy = {
    }
}
