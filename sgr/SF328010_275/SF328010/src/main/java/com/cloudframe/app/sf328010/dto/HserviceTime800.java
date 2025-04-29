package com.cloudframe.app.sf328010.dto;

/**
*  The class HserviceTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HserviceTime800 extends HserviceTime800Serialized { 
   

						private char[] hserviceHh800 = new char[2];

						private char[] hserviceMins800 = new char[2];

						private char[] hserviceSec800 = new char[2];
	
	/**
	* Constructor for HserviceTime800
	**/
    public HserviceTime800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HserviceTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HserviceTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHserviceHh800(fillSpace(2));
								setHserviceMins800(fillSpace(2));
								setHserviceSec800(fillSpace(2));
    } 

	/**
	 *	Returns the value of hserviceHh800
	 *	@return hserviceHh800
	 */
   public char[] getHserviceHh800() throws CFException{
     if (isHserviceHh800Modified()) { 
        hserviceHh800 = refreshHserviceHh800();
     }
   		return hserviceHh800;
   }

  
	/**
	*  set variable hserviceHh800
	*  Corresponding COBOL Variable is 800-HSERVICE-HH
	*  @param value
	**/
   public void setHserviceHh800(char[] value) {
      hserviceHh800 = checkHserviceHh800Constraints(value);
      serializeHserviceHh800(hserviceHh800);
   } 

     /**
	 * 	Update HserviceHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceHh800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceHh800,hserviceHh800.length);
   	
   }
   
   public void setHserviceHh800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceHh800,hserviceHh800.length);
   	
   }
   
     /**
	 * 	Update HserviceHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceHh800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceHh800 with another Field
	 *	@param value
	 */
   public void setHserviceHh800(Field source) {
       replace(source,0,source.length(),beginHserviceHh800,HSERVICE_HH_800_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceHh800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceHh800,HSERVICE_HH_800_LEN);
   	
   }
   
     /**
	 * 	Update HserviceHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceHh800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceMins800
	 *	@return hserviceMins800
	 */
   public char[] getHserviceMins800() throws CFException{
     if (isHserviceMins800Modified()) { 
        hserviceMins800 = refreshHserviceMins800();
     }
   		return hserviceMins800;
   }

  
	/**
	*  set variable hserviceMins800
	*  Corresponding COBOL Variable is 800-HSERVICE-MINS
	*  @param value
	**/
   public void setHserviceMins800(char[] value) {
      hserviceMins800 = checkHserviceMins800Constraints(value);
      serializeHserviceMins800(hserviceMins800);
   } 

     /**
	 * 	Update HserviceMins800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMins800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceMins800,hserviceMins800.length);
   	
   }
   
   public void setHserviceMins800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMins800,hserviceMins800.length);
   	
   }
   
     /**
	 * 	Update HserviceMins800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMins800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceMins800 with another Field
	 *	@param value
	 */
   public void setHserviceMins800(Field source) {
       replace(source,0,source.length(),beginHserviceMins800,HSERVICE_MINS_800_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceMins800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMins800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceMins800,HSERVICE_MINS_800_LEN);
   	
   }
   
     /**
	 * 	Update HserviceMins800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMins800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceSec800
	 *	@return hserviceSec800
	 */
   public char[] getHserviceSec800() throws CFException{
     if (isHserviceSec800Modified()) { 
        hserviceSec800 = refreshHserviceSec800();
     }
   		return hserviceSec800;
   }

  
	/**
	*  set variable hserviceSec800
	*  Corresponding COBOL Variable is 800-HSERVICE-SEC
	*  @param value
	**/
   public void setHserviceSec800(char[] value) {
      hserviceSec800 = checkHserviceSec800Constraints(value);
      serializeHserviceSec800(hserviceSec800);
   } 

     /**
	 * 	Update HserviceSec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceSec800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceSec800,hserviceSec800.length);
   	
   }
   
   public void setHserviceSec800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceSec800,hserviceSec800.length);
   	
   }
   
     /**
	 * 	Update HserviceSec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceSec800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceSec800 with another Field
	 *	@param value
	 */
   public void setHserviceSec800(Field source) {
       replace(source,0,source.length(),beginHserviceSec800,HSERVICE_SEC_800_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceSec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceSec800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceSec800,HSERVICE_SEC_800_LEN);
   	
   }
   
     /**
	 * 	Update HserviceSec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceSec800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHserviceTime800FieldLength() {
			return HSERVICE_TIME_800_LENGTH;
		}

}
  
