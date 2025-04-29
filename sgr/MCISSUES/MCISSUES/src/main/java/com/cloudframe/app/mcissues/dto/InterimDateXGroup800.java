package com.cloudframe.app.mcissues.dto;

/**
*  The class InterimDateXGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InterimDateXGroup800 extends InterimDateXGroup800Serialized {
   

						private char[] interimDateX800 = Field.fillLowValue(8);
					private InterimDate800 interimDate800 = new InterimDate800();
	
	/**
	* Constructor for InterimDateXGroup800
	**/
    public InterimDateXGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			interimDate800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of interimDateX800
	 *	@return interimDateX800
	 */
   public char[] getInterimDateX800() throws CFException{
     if (isInterimDateX800Modified()) { 
        interimDateX800 = refreshInterimDateX800();
     }
   		return interimDateX800;
   }

  
	/**
	*  set variable interimDateX800
	*  Corresponding COBOL Variable is 800-INTERIM-DATE-X
	*  @param value
	**/
   public void setInterimDateX800(char[] value) {
      interimDateX800 = checkInterimDateX800Constraints(value);
      serializeInterimDateX800(interimDateX800);
   } 

     /**
	 * 	Update InterimDateX800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInterimDateX800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInterimDateX800,interimDateX800.length);
   	
   }
   
   public void setInterimDateX800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInterimDateX800,interimDateX800.length);
   	
   }
   
     /**
	 * 	Update InterimDateX800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInterimDateX800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInterimDateX800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InterimDateX800 with another Field
	 *	@param value
	 */
   public void setInterimDateX800(Field source) {
       replace(source,0,source.length(),beginInterimDateX800,INTERIM_DATE_X_800_LEN);
   	
   }  
   
     /**
	 * 	Update InterimDateX800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInterimDateX800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInterimDateX800,INTERIM_DATE_X_800_LEN);
   	
   }
   
     /**
	 * 	Update InterimDateX800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInterimDateX800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInterimDateX800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of interimDate800
	 *	@return interimDate800
	 */   
	 public InterimDate800 getInterimDate800() {
   	return interimDate800;
   }
   /**
	* 	Update InterimDate800 with the passed value
	*   Corresponding COBOL Variable is 800-INTERIM-DATE
	*	@param value
	*/
   public void setInterimDate800(char[] value) {
      interimDate800.setString(value); 
   }   
    
     /**
	 * 	Update InterimDate800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInterimDate800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,interimDate800.begin,interimDate800.length());
   }
   
     /**
	 * 	Update InterimDate800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInterimDate800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,interimDate800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update InterimDate800 with another Field
	 *	@param value
	 */
   public void setInterimDate800(Field source) {
   	replace(source,0,source.length(),interimDate800.begin,interimDate800.length());
   }  
   
     /**
	 * 	Update InterimDate800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInterimDate800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,interimDate800.begin,interimDate800.length());
   }
   
     /**
	 * 	Update InterimDate800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInterimDate800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,interimDate800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getInterimDateXGroup800FieldLength() {
			return INTERIM_DATE_XGROUP_800_LENGTH;
		}

}
  
