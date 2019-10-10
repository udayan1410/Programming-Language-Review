package com.codecenter1430gmail.programminglanguagereview;

public class Htmlnamereturn  {

    String Rethtmlname(int id,String data)
    {
        String finaldata="";

        switch (id)
        {
            case 0:

                switch(data)
                {
                    case "Libraries":
                        finaldata = "c_lib";
                        break;

                    case "Data Types":
                        finaldata = "c_data";
                        break;

                    case "Operators":
                        finaldata="c_operators";
                        break;

                    case "Escape Sequences":
                        finaldata="c_esc";
                        break;

                    case "Pointers":
                        finaldata="c_pointer";
                         break;

                    case "Arrays":
                        finaldata="c_array";
                        break;

                    case "Functions":
                        finaldata="c_functions";
                        break;

                    case "Conditional Statements":
                        finaldata="c_conditional";
                        break;

                    case "Loops":
                        finaldata="c_loops";
                        break;

                    case "Strings":
                        finaldata="c_string";
                        break;

                    case "Dynamic Memory Allocation":
                        finaldata="c_dma";
                        break;

                    case "Enumeration":
                        finaldata="c_enum";
                        break;

                    case "LinkedList":
                        finaldata="c_linkedlist";
                        break;

                    case "File Handling":
                        finaldata="c_file";
                        break;

                    case "Structure and Union":
                        finaldata="c_structure";
                        break;
                }
            break;


            case 1:
                switch(data)
                {

                    case "Libraries":
                        finaldata="cpp_library";
                        break;

                    case "Data Types":
                        finaldata="c_data";
                        break;

                    case "Operators":
                        finaldata="c_operators";
                        break;

                    case "Escape Sequences":
                        finaldata="c_esc";
                        break;

                    case "Pointers":
                        finaldata="cpp_pointer";
                        break;

                    case "Conditional Statements":
                        finaldata="cpp_conditional";
                        break;

                    case "Loops":
                        finaldata="cpp_loops";
                        break;

                    case "Arrays":
                        finaldata="c_array";
                        break;

                    case "Strings":
                        finaldata="c_string";
                        break;

                    case "Class":
                        finaldata="cpp_class";
                        break;

                    case "Functions":
                        finaldata="c_functions";
                        break;

                    case "Constructor":
                        finaldata="cpp_constructor";
                        break;

                    case "Inheritance & Polymorphism":
                        finaldata="cpp_inheritance";
                        break;

                    case "Templates":
                        finaldata="cpp_template";
                        break;

                    case "Overloading":
                        finaldata="cpp_overloading";
                        break;

                    case "Exception Handling":
                        finaldata="cpp_exception";
                        break;

                    case "STL":
                        finaldata="cpp_stl";
                        break;

                    case "Linked List":
                        finaldata="cpp_linkedlist";
                        break;

                    case "Dynamic Memory Allocation":
                        finaldata="cpp_dma";
                        break;

                    case "File Handling":
                        finaldata="cpp_file";
                        break;

                }

                break;

            case 2:
                switch (data)
                {
                    case "Class and Objects":
                        finaldata="j_class";
                        break;

                    case "Constructor":
                        finaldata="j_constructor";
                        break;

                    case "Datatypes":
                        finaldata="j_datatypes";
                        break;

                    case "Basic Operators":
                        finaldata="j_operators";
                        break;

                    case "Loops":
                        finaldata="j_loops";
                        break;

                    case "Conditional Statements":
                        finaldata="j_conditional";
                        break;

                    case "Input Accepting":
                        finaldata="j_input";
                        break;

                    case "Strings":
                        finaldata="j_string";
                        break;

                    case "Arrays":
                        finaldata="j_array";
                        break;

                    case "Java Methods":
                        finaldata="j_methods";
                        break;

                    case "File Handling":
                        finaldata="j_files";
                        break;

                    case "Exceptions":
                        finaldata="j_exceptions";
                        break;

                    case "Inheritance":
                        finaldata="j_inheritance";
                        break;

                    case "Polymorphism":
                        finaldata="j_polymorphism";
                        break;

                    case "Interface":
                        finaldata="j_interfaces";
                        break;

                    case "Packages":
                        finaldata="j_packages";
                        break;

                    case "Data Structures":
                        finaldata="j_datastructure";
                        break;

                    case "JDBC":
                        finaldata="j_databaseconnectivity";
                        break;




                }

        }

        return finaldata;
    }

}

