package com.cloudframe.app.callprm2.dto;

/**
*  The class LsParm4Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:31. using version 5.0.0.257
**/


import com.cloudframe.app.callprm2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsParm4Group extends LsParm4GroupSerialized {
   

						private char[] lsParm4 = Field.fillLowValue(8);
	
	/**
	* Constructor for LsParm4Group
	**/
    public LsParm4Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lsParm4
	 *	@return lsParm4
	 */
   public char[] getLsParm4() throws CFException{
     if (isLsParm4Modified()) { 
        lsParm4 = refreshLsParm4();
     }
   		return lsParm4;
   }

  
	/**
	*  set variable lsParm4
	*  Corresponding COBOL Variable is LS-PARM4
	*  @param value
	**/
   public void setLsParm4(char[] value) {
      lsParm4 = checkLsParm4Constraints(value);
      serializeLsParm4(lsParm4);
   } 

     /**
	 * 	Update LsParm4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsParm4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsParm4,lsParm4.length);
   	
   }
   
   public void setLsParm4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsParm4,lsParm4.length);
   	
   }
   
     /**
	 * 	Update LsParm4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsParm4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsParm4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsParm4 with another Field
	 *	@param value
	 */
   public void setLsParm4(Field source) {
       replace(source,0,source.length(),beginLsParm4,LS_PARM_4_LEN);
   	
   }  
   
     /**
	 * 	Update LsParm4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsParm4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsParm4,LS_PARM_4_LEN);
   	
   }
   
     /**
	 * 	Update LsParm4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsParm4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsParm4+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLsParm4GroupFieldLength() {
			return LS_PARM_4_GROUP_LENGTH;
		}

}
  
