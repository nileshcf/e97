package com.cloudframe.app.sf327010.dto;

/**
*  The class LserviceTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LserviceTime800 extends LserviceTime800Serialized { 
   

						private char[] lserviceHh800 = new char[2];

						private char[] lserviceMins800 = new char[2];

						private char[] lserviceSec800 = new char[2];
	
	/**
	* Constructor for LserviceTime800
	**/
    public LserviceTime800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LserviceTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LserviceTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLserviceHh800(fillSpace(2));
								setLserviceMins800(fillSpace(2));
								setLserviceSec800(fillSpace(2));
    } 

	/**
	 *	Returns the value of lserviceHh800
	 *	@return lserviceHh800
	 */
   public char[] getLserviceHh800() throws CFException{
     if (isLserviceHh800Modified()) { 
        lserviceHh800 = refreshLserviceHh800();
     }
   		return lserviceHh800;
   }

  
	/**
	*  set variable lserviceHh800
	*  Corresponding COBOL Variable is 800-LSERVICE-HH
	*  @param value
	**/
   public void setLserviceHh800(char[] value) {
      lserviceHh800 = checkLserviceHh800Constraints(value);
      serializeLserviceHh800(lserviceHh800);
   } 

     /**
	 * 	Update LserviceHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceHh800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceHh800,lserviceHh800.length);
   	
   }
   
   public void setLserviceHh800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceHh800,lserviceHh800.length);
   	
   }
   
     /**
	 * 	Update LserviceHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceHh800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceHh800 with another Field
	 *	@param value
	 */
   public void setLserviceHh800(Field source) {
       replace(source,0,source.length(),beginLserviceHh800,LSERVICE_HH_800_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceHh800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceHh800,LSERVICE_HH_800_LEN);
   	
   }
   
     /**
	 * 	Update LserviceHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceHh800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceMins800
	 *	@return lserviceMins800
	 */
   public char[] getLserviceMins800() throws CFException{
     if (isLserviceMins800Modified()) { 
        lserviceMins800 = refreshLserviceMins800();
     }
   		return lserviceMins800;
   }

  
	/**
	*  set variable lserviceMins800
	*  Corresponding COBOL Variable is 800-LSERVICE-MINS
	*  @param value
	**/
   public void setLserviceMins800(char[] value) {
      lserviceMins800 = checkLserviceMins800Constraints(value);
      serializeLserviceMins800(lserviceMins800);
   } 

     /**
	 * 	Update LserviceMins800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMins800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceMins800,lserviceMins800.length);
   	
   }
   
   public void setLserviceMins800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMins800,lserviceMins800.length);
   	
   }
   
     /**
	 * 	Update LserviceMins800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMins800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceMins800 with another Field
	 *	@param value
	 */
   public void setLserviceMins800(Field source) {
       replace(source,0,source.length(),beginLserviceMins800,LSERVICE_MINS_800_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceMins800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMins800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceMins800,LSERVICE_MINS_800_LEN);
   	
   }
   
     /**
	 * 	Update LserviceMins800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMins800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceSec800
	 *	@return lserviceSec800
	 */
   public char[] getLserviceSec800() throws CFException{
     if (isLserviceSec800Modified()) { 
        lserviceSec800 = refreshLserviceSec800();
     }
   		return lserviceSec800;
   }

  
	/**
	*  set variable lserviceSec800
	*  Corresponding COBOL Variable is 800-LSERVICE-SEC
	*  @param value
	**/
   public void setLserviceSec800(char[] value) {
      lserviceSec800 = checkLserviceSec800Constraints(value);
      serializeLserviceSec800(lserviceSec800);
   } 

     /**
	 * 	Update LserviceSec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceSec800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceSec800,lserviceSec800.length);
   	
   }
   
   public void setLserviceSec800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceSec800,lserviceSec800.length);
   	
   }
   
     /**
	 * 	Update LserviceSec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceSec800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceSec800 with another Field
	 *	@param value
	 */
   public void setLserviceSec800(Field source) {
       replace(source,0,source.length(),beginLserviceSec800,LSERVICE_SEC_800_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceSec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceSec800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceSec800,LSERVICE_SEC_800_LEN);
   	
   }
   
     /**
	 * 	Update LserviceSec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceSec800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLserviceTime800FieldLength() {
			return LSERVICE_TIME_800_LENGTH;
		}

}
  
