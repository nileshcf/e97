package com.cloudframe.app.ip809050.dto;

/**
*  The class Pds841ValuesGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Pds841ValuesGroup800 extends Pds841ValuesGroup800Serialized { 
   

						private char[] pds841Values800 = new char[8];
					private Pds841800 pds841800 = new Pds841800();
	
	/**
	* Constructor for Pds841ValuesGroup800
	**/
    public Pds841ValuesGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			pds841800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setPds841Values800(fillSpace(8));
    }


 

	/**
	 *	Returns the value of pds841Values800
	 *	@return pds841Values800
	 */
   public char[] getPds841Values800() throws CFException{
     if (isPds841Values800Modified()) { 
        pds841Values800 = refreshPds841Values800();
     }
   		return pds841Values800;
   }

  
	/**
	*  set variable pds841Values800
	*  Corresponding COBOL Variable is 800-PDS841-VALUES
	*  @param value
	**/
   public void setPds841Values800(char[] value) {
      pds841Values800 = checkPds841Values800Constraints(value);
      serializePds841Values800(pds841Values800);
   } 

     /**
	 * 	Update Pds841Values800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds841Values800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPds841Values800,pds841Values800.length);
   	
   }
   
   public void setPds841Values800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPds841Values800,pds841Values800.length);
   	
   }
   
     /**
	 * 	Update Pds841Values800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds841Values800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds841Values800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pds841Values800 with another Field
	 *	@param value
	 */
   public void setPds841Values800(Field source) {
       replace(source,0,source.length(),beginPds841Values800,PDS_841_VALUES_800_LEN);
   	
   }  
   
     /**
	 * 	Update Pds841Values800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds841Values800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPds841Values800,PDS_841_VALUES_800_LEN);
   	
   }
   
     /**
	 * 	Update Pds841Values800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds841Values800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds841Values800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pds841800
	 *	@return pds841800
	 */   
	 public Pds841800 getPds841800() {
   	return pds841800;
   }
   /**
	* 	Update Pds841800 with the passed value
	*   Corresponding COBOL Variable is 800-PDS841
	*	@param value
	*/
   public void setPds841800(char[] value) {
      pds841800.setString(value); 
   }   
    
     /**
	 * 	Update Pds841800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPds841800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pds841800.begin,pds841800.length());
   }
   
     /**
	 * 	Update Pds841800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds841800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pds841800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Pds841800 with another Field
	 *	@param value
	 */
   public void setPds841800(Field source) {
   	replace(source,0,source.length(),pds841800.begin,pds841800.length());
   }  
   
     /**
	 * 	Update Pds841800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPds841800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pds841800.begin,pds841800.length());
   }
   
     /**
	 * 	Update Pds841800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds841800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pds841800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getPds841ValuesGroup800FieldLength() {
			return PDS_841_VALUES_GROUP_800_LENGTH;
		}

}
  
