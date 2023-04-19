<?php

// Integer
$age = 25;

// Float
$price = 12.50;

// String
$name = "John";

// Boolean
$is_active = true;

// Array
$colors = array("red", "green", "blue");

// Object
class Person {
  public $name;
  public $age;
}

$person = new Person();
$person->name = "John";
$person->age = 25;

// NULL
$no_value = null;

// Resource
$database = mysqli_connect("localhost", "username", "password", "database");

?>
