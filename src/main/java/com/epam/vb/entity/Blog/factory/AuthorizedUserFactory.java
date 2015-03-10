package com.epam.vb.entity.Blog.factory;

import com.epam.vb.entity.Blog.model.Authorized;
import com.thedeanda.lorem.Lorem;

import java.util.Date;

public class AuthorizedUserFactory {
    private static final Date BIRTHDAY_S = new Date(70,0,1);
    private static final Date BIRTHDAY_E = new Date(100,0,1);
    private static final Date REG_DATE_S =  new Date(110,0,0);
    private static final Date REG_DATE_E = new Date(114,0,1);

    public static Authorized create(){
        Authorized authorized = new Authorized();
        authorized.setDataBirth(Dates.randomDateBetween(BIRTHDAY_S,BIRTHDAY_E));
        String firstName = Lorem.getFirstName();
        String lastName = Lorem.getLastName();
        authorized.setEmail(firstName.toLowerCase() + "@" + lastName.toLowerCase() + ".org");
        authorized.setFirstName(firstName);
        authorized.setLastName(lastName);
        authorized.setDateRegistration(Dates.randomDateBetween(REG_DATE_S,REG_DATE_E));
        authorized.setGender(Gender.gender());
        return authorized;
    }

}
