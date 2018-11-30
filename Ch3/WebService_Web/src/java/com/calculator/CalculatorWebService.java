/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Reynald Adolphe
 */
@WebService(serviceName = "CalculatorWebService")
public class CalculatorWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Sum")
    public int Sum(@WebParam(name = "sum1") int sum1, @WebParam(name = "sum2") int sum2) {
        //TODO write your implementation code here:
        return sum1 + sum2;
    }


}
