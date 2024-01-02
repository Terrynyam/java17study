package org.example;

/**
 * @author Terrance Nyamfukudza
 * 28/12/2023
 */
public class InstanceInitializerBlock {
    /*This class has a blank final boolean instance variable active. This
    variable must be initialized when an instance is constructed, or else
    the code will not compile. This also applies to blank final static
    variables. The keyword static is used to signify that a block is a
    static initializer block. No keyword is used to signify that a block is
    an instance initializer block. The instance final variable active must be
    initialized.
    */
    static int gap = 10;
    double length;
    final boolean active;
    //initializing final variable active
    { active = (gap > 5); length = 5.5 + gap;}
}
