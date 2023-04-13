person = new Object();
person.firstName = "Royce"
person.lastName = "Moses"
person.age = 22
person.address = "Rosemead"

with (person)
{
    document.write(firstName);
    document.write(lastName);
    document.write(age);
    document.write(address);
}