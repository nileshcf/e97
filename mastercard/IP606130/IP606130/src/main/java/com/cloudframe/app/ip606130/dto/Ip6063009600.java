package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip6063009600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip6063009600 extends Ip6063009600Serialized {
   


						private char[] tabSubId6003009 = new char[3];

	
	/**
	* Constructor for Ip6063009600
	**/
    public Ip6063009600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" TABLE SUB ID ").toCharArray()
             , getStartOffset() + 0
             ,14
             );
								setTabSubId6003009(fillSpace(3));
       replaceValue( // serialize and save the value
             (" WAS NOT FOUND ON TABLE IP0000T1.  ").toCharArray()
             , getStartOffset() + 17
             ,35
             );
    }


 

	/**
	 *	Returns the value of tabSubId6003009
	 *	@return tabSubId6003009
	 */
   public char[] getTabSubId6003009() throws CFException{
     if (isTabSubId6003009Modified()) { 
        tabSubId6003009 = refreshTabSubId6003009();
     }
   		return tabSubId6003009;
   }

  
	/**
	*  set variable tabSubId6003009
	*  Corresponding COBOL Variable is 600-3009-TAB-SUB-ID
	*  @param value
	**/
   public void setTabSubId6003009(char[] value) {
      tabSubId6003009 = checkTabSubId6003009Constraints(value);
      serializeTabSubId6003009(tabSubId6003009);
   } 

     /**
	 * 	Update TabSubId6003009 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTabSubId6003009(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTabSubId6003009,tabSubId6003009.length);
   	
   }
   
   public void setTabSubId6003009(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTabSubId6003009,tabSubId6003009.length);
   	
   }
   
     /**
	 * 	Update TabSubId6003009 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTabSubId6003009(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTabSubId6003009+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TabSubId6003009 with another Field
	 *	@param value
	 */
   public void setTabSubId6003009(Field source) {
       replace(source,0,source.length(),beginTabSubId6003009,TAB_SUB_ID_6003009_LEN);
   	
   }  
   
     /**
	 * 	Update TabSubId6003009 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTabSubId6003009(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTabSubId6003009,TAB_SUB_ID_6003009_LEN);
   	
   }
   
     /**
	 * 	Update TabSubId6003009 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTabSubId6003009(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTabSubId6003009+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp6063009600FieldLength() {
			return IP_6063009600_LENGTH;
		}

}
  
