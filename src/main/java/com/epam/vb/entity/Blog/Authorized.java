package com.epam.vb.entity.Blog;

import javax.xml.crypto.Data;
import java.util.UUID;

public abstract class Authorized extends User {

    private String secondName;
    private String email;
    private Data dataBirth;
    private String nickName;
    private char password;
    private UUID id; /* = UUID.randomUUID();*/

}
