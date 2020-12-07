/*
 * Copyright (c) 2002-2020, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *"
 * License 1.0
 */

package fr.paris.lutece.plugins.testmoussia.business;

import fr.paris.lutece.test.LuteceTestCase;


/**
 * This is the business class test for the object User
 */
public class UserBusinessTest extends LuteceTestCase
{
    private static final String NOM1 = "Nom1";
    private static final String NOM2 = "Nom2";

	/**
	* test User
	*/
    public void testBusiness(  )
    {
        // Initialize an object
        User user = new User();
        user.setNom( NOM1 );

        // Create test
        UserHome.create( user );
        User userStored = UserHome.findByPrimaryKey( user.getId( ) );
        assertEquals( userStored.getNom() , user.getNom( ) );

        // Update test
        user.setNom( NOM2 );
        UserHome.update( user );
        userStored = UserHome.findByPrimaryKey( user.getId( ) );
        assertEquals( userStored.getNom() , user.getNom( ) );

        // List test
        UserHome.getUsersList( );

        // Delete test
        UserHome.remove( user.getId( ) );
        userStored = UserHome.findByPrimaryKey( user.getId( ) );
        assertNull( userStored );
        
    }
    
    
     

}