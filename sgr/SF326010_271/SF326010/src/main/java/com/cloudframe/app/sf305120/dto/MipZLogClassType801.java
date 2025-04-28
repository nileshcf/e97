package com.cloudframe.app.sf305120.dto;

/**
*  The class MipZLogClassType801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MipZLogClassType801 extends MipZLogClassType801Serialized { 
   

						private char[] mipZLogClass801 = new char[1];

						private char[] mipZLogTyp801 = new char[1];
	
	/**
	* Constructor for MipZLogClassType801
	**/
    public MipZLogClassType801() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MipZLogClassType801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MipZLogClassType801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMipZLogClass801(fillSpace(1));
								setMipZLogTyp801(fillSpace(1));
    } 

	/**
	 *	Returns the value of mipZLogClass801
	 *	@return mipZLogClass801
	 */
   public char[] getMipZLogClass801() throws CFException{
     if (isMipZLogClass801Modified()) { 
        mipZLogClass801 = refreshMipZLogClass801();
     }
   		return mipZLogClass801;
   }

  
	/**
	*  set variable mipZLogClass801
	*  Corresponding COBOL Variable is 801-MIP-Z-LOG-CLASS
	*  @param value
	**/
   public void setMipZLogClass801(char[] value) {
      mipZLogClass801 = checkMipZLogClass801Constraints(value);
      serializeMipZLogClass801(mipZLogClass801);
   } 

     /**
	 * 	Update MipZLogClass801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipZLogClass801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipZLogClass801,mipZLogClass801.length);
   	
   }
   
   public void setMipZLogClass801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogClass801,mipZLogClass801.length);
   	
   }
   
     /**
	 * 	Update MipZLogClass801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogClass801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogClass801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipZLogClass801 with another Field
	 *	@param value
	 */
   public void setMipZLogClass801(Field source) {
       replace(source,0,source.length(),beginMipZLogClass801,MIP_ZLOG_CLASS_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipZLogClass801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipZLogClass801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipZLogClass801,MIP_ZLOG_CLASS_801_LEN);
   	
   }
   
     /**
	 * 	Update MipZLogClass801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogClass801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogClass801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mipZLogTyp801
	 *	@return mipZLogTyp801
	 */
   public char[] getMipZLogTyp801() throws CFException{
     if (isMipZLogTyp801Modified()) { 
        mipZLogTyp801 = refreshMipZLogTyp801();
     }
   		return mipZLogTyp801;
   }

  
	/**
	*  set variable mipZLogTyp801
	*  Corresponding COBOL Variable is 801-MIP-Z-LOG-TYP
	*  @param value
	**/
   public void setMipZLogTyp801(char[] value) {
      mipZLogTyp801 = checkMipZLogTyp801Constraints(value);
      serializeMipZLogTyp801(mipZLogTyp801);
   } 

     /**
	 * 	Update MipZLogTyp801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipZLogTyp801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipZLogTyp801,mipZLogTyp801.length);
   	
   }
   
   public void setMipZLogTyp801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogTyp801,mipZLogTyp801.length);
   	
   }
   
     /**
	 * 	Update MipZLogTyp801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogTyp801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogTyp801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipZLogTyp801 with another Field
	 *	@param value
	 */
   public void setMipZLogTyp801(Field source) {
       replace(source,0,source.length(),beginMipZLogTyp801,MIP_ZLOG_TYP_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipZLogTyp801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipZLogTyp801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipZLogTyp801,MIP_ZLOG_TYP_801_LEN);
   	
   }
   
     /**
	 * 	Update MipZLogTyp801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogTyp801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogTyp801+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMipZLogClassType801FieldLength() {
			return MIP_ZLOG_CLASS_TYPE_801_LENGTH;
		}

}
  
