/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thinkmicroservices.ri.spring.web;

import org.springframework.web.filter.CommonsRequestLoggingFilter;

public class CustomRequestLoggingFilter extends CommonsRequestLoggingFilter {

    public CustomRequestLoggingFilter(){
       //super.setMaxPayLoadLength(2000);
       //super.setIncludePayLoad(true);
       super.setIncludeQueryString(true);
       super.setIncludeHeaders(true);
       super.setIncludeQueryString(true);
       
   } 
} 
