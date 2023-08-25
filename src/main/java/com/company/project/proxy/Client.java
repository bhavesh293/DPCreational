package com.company.project.proxy;

/*
 * A very simple real life scenario is our college internet, 
 * which restricts few site access. 
 * 
 * The proxy first checks the host you are connecting to, 
 * if it is not part of restricted site list, then it connects to the real internet. 
 * 
 * This example is based on Protection proxies.
 */
public class Client
{
    public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
