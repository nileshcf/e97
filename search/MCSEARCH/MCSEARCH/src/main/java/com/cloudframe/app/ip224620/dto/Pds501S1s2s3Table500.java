package com.cloudframe.app.ip224620.dto;

/**
*  The class Pds501S1s2s3Table500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:55. using version 5.0.0.254
**/


import com.cloudframe.app.ip224620.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Pds501S1s2s3Table500 extends Pds501S1s2s3Table500Serialized { 
   

						private char[] subfld1Value500 = new char[2];

						private char[] subfld2Value500 = new char[3];

						private char[] subfld3Value500 = new char[3];
	
	/**
	* Constructor for Pds501S1s2s3Table500
	**/
    public Pds501S1s2s3Table500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Pds501S1s2s3Table500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pds501S1s2s3Table500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSubfld1Value500(fillSpace(2));
								setSubfld2Value500(fillSpace(3));
								setSubfld3Value500(fillSpace(3));
    } 

	/**
	 *	Returns the value of subfld1Value500
	 *	@return subfld1Value500
	 */
   public char[] getSubfld1Value500() throws CFException{
     if (isSubfld1Value500Modified()) { 
        subfld1Value500 = refreshSubfld1Value500();
     }
   		return subfld1Value500;
   }

  
	/**
	*  set variable subfld1Value500
	*  Corresponding COBOL Variable is 500-SUBFLD-1-VALUE
	*  @param value
	**/
   public void setSubfld1Value500(char[] value) {
      subfld1Value500 = checkSubfld1Value500Constraints(value);
      serializeSubfld1Value500(subfld1Value500);
   } 

     /**
	 * 	Update Subfld1Value500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubfld1Value500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSubfld1Value500,subfld1Value500.length);
   	
   }
   
   public void setSubfld1Value500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSubfld1Value500,subfld1Value500.length);
   	
   }
   
     /**
	 * 	Update Subfld1Value500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubfld1Value500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSubfld1Value500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Subfld1Value500 with another Field
	 *	@param value
	 */
   public void setSubfld1Value500(Field source) {
       replace(source,0,source.length(),beginSubfld1Value500,SUBFLD_1_VALUE_500_LEN);
   	
   }  
   
     /**
	 * 	Update Subfld1Value500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubfld1Value500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSubfld1Value500,SUBFLD_1_VALUE_500_LEN);
   	
   }
   
     /**
	 * 	Update Subfld1Value500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubfld1Value500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSubfld1Value500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of subfld2Value500
	 *	@return subfld2Value500
	 */
   public char[] getSubfld2Value500() throws CFException{
     if (isSubfld2Value500Modified()) { 
        subfld2Value500 = refreshSubfld2Value500();
     }
   		return subfld2Value500;
   }

  
	/**
	*  set variable subfld2Value500
	*  Corresponding COBOL Variable is 500-SUBFLD-2-VALUE
	*  @param value
	**/
   public void setSubfld2Value500(char[] value) {
      subfld2Value500 = checkSubfld2Value500Constraints(value);
      serializeSubfld2Value500(subfld2Value500);
   } 

     /**
	 * 	Update Subfld2Value500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubfld2Value500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSubfld2Value500,subfld2Value500.length);
   	
   }
   
   public void setSubfld2Value500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSubfld2Value500,subfld2Value500.length);
   	
   }
   
     /**
	 * 	Update Subfld2Value500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubfld2Value500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSubfld2Value500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Subfld2Value500 with another Field
	 *	@param value
	 */
   public void setSubfld2Value500(Field source) {
       replace(source,0,source.length(),beginSubfld2Value500,SUBFLD_2_VALUE_500_LEN);
   	
   }  
   
     /**
	 * 	Update Subfld2Value500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubfld2Value500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSubfld2Value500,SUBFLD_2_VALUE_500_LEN);
   	
   }
   
     /**
	 * 	Update Subfld2Value500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubfld2Value500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSubfld2Value500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of subfld3Value500
	 *	@return subfld3Value500
	 */
   public char[] getSubfld3Value500() throws CFException{
     if (isSubfld3Value500Modified()) { 
        subfld3Value500 = refreshSubfld3Value500();
     }
   		return subfld3Value500;
   }

  
	/**
	*  set variable subfld3Value500
	*  Corresponding COBOL Variable is 500-SUBFLD-3-VALUE
	*  @param value
	**/
   public void setSubfld3Value500(char[] value) {
      subfld3Value500 = checkSubfld3Value500Constraints(value);
      serializeSubfld3Value500(subfld3Value500);
   } 

     /**
	 * 	Update Subfld3Value500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubfld3Value500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSubfld3Value500,subfld3Value500.length);
   	
   }
   
   public void setSubfld3Value500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSubfld3Value500,subfld3Value500.length);
   	
   }
   
     /**
	 * 	Update Subfld3Value500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubfld3Value500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSubfld3Value500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Subfld3Value500 with another Field
	 *	@param value
	 */
   public void setSubfld3Value500(Field source) {
       replace(source,0,source.length(),beginSubfld3Value500,SUBFLD_3_VALUE_500_LEN);
   	
   }  
   
     /**
	 * 	Update Subfld3Value500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubfld3Value500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSubfld3Value500,SUBFLD_3_VALUE_500_LEN);
   	
   }
   
     /**
	 * 	Update Subfld3Value500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubfld3Value500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSubfld3Value500+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPds501S1s2s3Table500FieldLength() {
			return PDS_501_S_1S_2S_3_TABLE_500_LENGTH;
		}

}
  
