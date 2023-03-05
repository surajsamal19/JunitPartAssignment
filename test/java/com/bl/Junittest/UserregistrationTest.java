package com.bl.Junittest;

import org.junit.Assert;
import org.junit.Test;

public class UserregistrationTest {
    Userregistration usertest = new Userregistration();

    @Test
    public void checkfirstname() {
        boolean result = usertest.getfirstrname("suraj");
        Assert.assertTrue(result);
    }

    @Test
    public void checklfirstname() {
        boolean result = usertest.getfirstrname("Sk");
        Assert.assertTrue(result);
    }

    @Test
    public void checklastname() {
        boolean result = usertest.getLastName("Samal");
        Assert.assertTrue(result);
    }

    @Test
    public void checklastname() {
        boolean reuslt = usertest.getLastName("Sm");
        Assert.assertTrue(reuslt);
    }

    @Test
    public void checkemailid() {
        boolean result = usertest.getEmailid("samalsuraj19@gmail.com");
        Assert.assertTrue(result);
        @Test
        public void checkemailid () {
            boolean result = usertest.getEmailid("samalsuraj");
            Assert.assertTrue(result);
        }
        @Test
        public void check_Given_PasswordRule2(){

            UserRegistration password_Test = new UserRegistration();
            Boolean result = password_Test.getPasswordRule2("surajsamal");
            Assert.assertTrue(result);

        }

        @Test
        //@DisplayName("Password Check Rule 3")
        public void check_Given_Password_Rule3(){

            UserRegistration password_Test = new UserRegistration();
            Boolean result = password_Test.getPasswordRule3("surajsamal");
            Assert.assertTrue(result);

        }

        @Test
        public void check_Given_PasswordRule3(){

            UserRegistration password_Test = new UserRegistration();
            Boolean result = password_Test.getPasswordRule3("surajsamal");
            Assert.assertTrue(result);

        }

        @Test
        //@DisplayName("Password Check Rule 4")
        public void check_Given_Password_Rule4(){

            UserRegistration password_Test = new UserRegistration();
            Boolean result = password_Test.getPasswordRule4("samalsuraj19@gmail.com");
            Assert.assertTrue(result);

        }

        @Test
        public void check_Given_PasswordRule4(){

            UserRegistration password_Test = new UserRegistration();
            Boolean result = password_Test.getPasswordRule4("samalsuraj");
            Assert.assertTrue(result);

        }


    }

    }


