package com.cloudframe.app.callprm1.dto;

/**
*  The class LsParm1Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:13. using version 5.0.0.254
**/


import com.cloudframe.app.callprm1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsParm1Group extends LsParm1GroupSerialized {
   

						private char[] lsParm1 = Field.fillLowValue(8);
	
	/**
	* Constructor for LsParm1Group
	**/
    public LsParm1Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lsParm1
	 *	@return lsParm1
	 */
   public char[] getLsParm1() throws CFException{
     if (isLsParm1Modified()) { 
        lsParm1 = refreshLsParm1();
     }
   		return lsParm1;
   }

  
	/**
	*  set variable lsParm1
	*  Corresponding COBOL Variable is LS-PARM1
	*  @param value
	**/
   public void setLsParm1(char[] value) {
      lsParm1 = checkLsParm1Constraints(value);
      serializeLsParm1(lsParm1);
   } 

     /**
	 * 	Update LsParm1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsParm1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsParm1,lsParm1.length);
   	
   }
   
   public void setLsParm1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsParm1,lsParm1.length);
   	
   }
   
     /**
	 * 	Update LsParm1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsParm1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsParm1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsParm1 with another Field
	 *	@param value
	 */
   public void setLsParm1(Field source) {
       replace(source,0,source.length(),beginLsParm1,LS_PARM_1_LEN);
   	
   }  
   
     /**
	 * 	Update LsParm1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsParm1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsParm1,LS_PARM_1_LEN);
   	
   }
   
     /**
	 * 	Update LsParm1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsParm1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsParm1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLsParm1GroupFieldLength() {
			return LS_PARM_1_GROUP_LENGTH;
		}

}
  
