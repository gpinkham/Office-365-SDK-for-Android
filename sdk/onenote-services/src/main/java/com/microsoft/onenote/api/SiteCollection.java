/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.onenote.api;

import com.microsoft.services.orc.ODataBaseEntity;


/**
 * The type Site Collection.
*/
public class SiteCollection extends ODataBaseEntity {

    public SiteCollection(){
        setODataType("#Microsoft.OneNote.Api.SiteCollection");
    }
            
    private String id;
     
    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getId() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setId(String value) { 
        this.id = value; 
        valueChanged("id", value);

    }
    
        
    private java.util.List<Site> sites = null;
    
    
     
    /**
    * Gets the sites.
    *
    * @return the java.util.List<Site>
    */
    public java.util.List<Site> getSites() {
        return this.sites; 
    }

    /**
    * Sets the sites.
    *
    * @param value the java.util.List<Site>
    */
    public void setSites(java.util.List<Site> value) { 
        this.sites = value; 
        valueChanged("sites", value);

    }
}

