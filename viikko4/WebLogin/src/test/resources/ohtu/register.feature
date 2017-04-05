Feature: A new user account can be created if a proper unused username and password are given

        Scenario: creation succesful with correct username and password
        Given new user is selected
        When  username "kayttaja" and password "salasana1" and  confirmation "salasana1" are given
        Then  user is registered


        Scenario: creation fails with too short username and valid password
        Given new user is selected
        When  username "ok" and password "salasana1" and  confirmation "salasana1" are given
        Then user is not created and error "username should have at least 3 characters" is reported

        Scenario: creation fails with correct username and too short password
        Given new user is selected
        When  username "kayttaja" and password "ly1" and  confirmation "ly1" are given
        Then user is not created and error "password should have at least 8 characters" is reported


        Scenario: creation fails with correct username and password consisting of letters
        Given new user is selected
        When  username "kayttaja" and password "salasana" and  confirmation "salasana" are given
        Then user is not created and error "password can not contain only letters" is reported

        Scenario: creation fails with already taken username and valid pasword
        Given new user is selected
        When  username "jukka" and password "salasana1" and  confirmation "salasana1" are given
        Then user is not created and error "username is already taken" is reported


        Scenario: creation fails when password and password confirmation do not match
        Given new user is selected
        When  username "uusi" and password "salasana1" and  confirmation "kukkaruukku5" are given
        Then user is not created and error "password and password confirmation do not match" is reported
