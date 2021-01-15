package my.app

import grails.converters.JSON

class PersonController {

    def index() { }
    def save(){
        Person person=new Person()
        person.firstName='s'
        person.lastName='g'
        person.save(flush:true)
        render person as JSON

    }

    def update(){
        Person person=Person.findByFirstName('s')
        Address paddress=new Address()
        paddress.addressLine='d'
        paddress.addressLine2='m'
        paddress.street='s'
        person.addresses['pAddress'] = paddress
        person.markDirty('addresses')

        person.save(flush:true)
        render person as JSON

    }
}
