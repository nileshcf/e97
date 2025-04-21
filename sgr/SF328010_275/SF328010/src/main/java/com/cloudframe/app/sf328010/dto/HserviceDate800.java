package com.cloudframe.app.sf328010.dto;

/**
*  The class HserviceDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HserviceDate800 extends HserviceDate800Serialized { 
   

						private char[] hserviceCc800 = new char[2];

						private char[] hserviceYy800 = new char[2];

						private char[] hserviceMm800 = new char[2];

						private char[] hserviceDd800 = new char[2];
	
	/**
	* Constructor for HserviceDate800
	**/
    public HserviceDate800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HserviceDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HserviceDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHserviceCc800(fillSpace(2));
								setHserviceYy800(fillSpace(2));
								setHserviceMm800(fillSpace(2));
								setHserviceDd800(fillSpace(2));
    } 

	/**
	 *	Returns the value of hserviceCc800
	 *	@return hserviceCc800
	 */
   public char[] getHserviceCc800() throws CFException{
     if (isHserviceCc800Modified()) { 
        hserviceCc800 = refreshHserviceCc800();
     }
   		return hserviceCc800;
   }

  
	/**
	*  set variable hserviceCc800
	*  Corresponding COBOL Variable is 800-HSERVICE-CC
	*  @param value
	**/
   public void setHserviceCc800(char[] value) {
      hserviceCc800 = checkHserviceCc800Constraints(value);
      serializeHserviceCc800(hserviceCc800);
   } 

     /**
	 * 	Update HserviceCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceCc800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceCc800,hserviceCc800.length);
   	
   }
   
   public void setHserviceCc800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceCc800,hserviceCc800.length);
   	
   }
   
     /**
	 * 	Update HserviceCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceCc800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceCc800 with another Field
	 *	@param value
	 */
   public void setHserviceCc800(Field source) {
       replace(source,0,source.length(),beginHserviceCc800,HSERVICE_CC_800_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceCc800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceCc800,HSERVICE_CC_800_LEN);
   	
   }
   
     /**
	 * 	Update HserviceCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceCc800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceYy800
	 *	@return hserviceYy800
	 */
   public char[] getHserviceYy800() throws CFException{
     if (isHserviceYy800Modified()) { 
        hserviceYy800 = refreshHserviceYy800();
     }
   		return hserviceYy800;
   }

  
	/**
	*  set variable hserviceYy800
	*  Corresponding COBOL Variable is 800-HSERVICE-YY
	*  @param value
	**/
   public void setHserviceYy800(char[] value) {
      hserviceYy800 = checkHserviceYy800Constraints(value);
      serializeHserviceYy800(hserviceYy800);
   } 

     /**
	 * 	Update HserviceYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceYy800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceYy800,hserviceYy800.length);
   	
   }
   
   public void setHserviceYy800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceYy800,hserviceYy800.length);
   	
   }
   
     /**
	 * 	Update HserviceYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceYy800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceYy800 with another Field
	 *	@param value
	 */
   public void setHserviceYy800(Field source) {
       replace(source,0,source.length(),beginHserviceYy800,HSERVICE_YY_800_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceYy800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceYy800,HSERVICE_YY_800_LEN);
   	
   }
   
     /**
	 * 	Update HserviceYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceYy800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceMm800
	 *	@return hserviceMm800
	 */
   public char[] getHserviceMm800() throws CFException{
     if (isHserviceMm800Modified()) { 
        hserviceMm800 = refreshHserviceMm800();
     }
   		return hserviceMm800;
   }

  
	/**
	*  set variable hserviceMm800
	*  Corresponding COBOL Variable is 800-HSERVICE-MM
	*  @param value
	**/
   public void setHserviceMm800(char[] value) {
      hserviceMm800 = checkHserviceMm800Constraints(value);
      serializeHserviceMm800(hserviceMm800);
   } 

     /**
	 * 	Update HserviceMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMm800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceMm800,hserviceMm800.length);
   	
   }
   
   public void setHserviceMm800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMm800,hserviceMm800.length);
   	
   }
   
     /**
	 * 	Update HserviceMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMm800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceMm800 with another Field
	 *	@param value
	 */
   public void setHserviceMm800(Field source) {
       replace(source,0,source.length(),beginHserviceMm800,HSERVICE_MM_800_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMm800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceMm800,HSERVICE_MM_800_LEN);
   	
   }
   
     /**
	 * 	Update HserviceMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMm800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceDd800
	 *	@return hserviceDd800
	 */
   public char[] getHserviceDd800() throws CFException{
     if (isHserviceDd800Modified()) { 
        hserviceDd800 = refreshHserviceDd800();
     }
   		return hserviceDd800;
   }

  
	/**
	*  set variable hserviceDd800
	*  Corresponding COBOL Variable is 800-HSERVICE-DD
	*  @param value
	**/
   public void setHserviceDd800(char[] value) {
      hserviceDd800 = checkHserviceDd800Constraints(value);
      serializeHserviceDd800(hserviceDd800);
   } 

     /**
	 * 	Update HserviceDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceDd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceDd800,hserviceDd800.length);
   	
   }
   
   public void setHserviceDd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceDd800,hserviceDd800.length);
   	
   }
   
     /**
	 * 	Update HserviceDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceDd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceDd800 with another Field
	 *	@param value
	 */
   public void setHserviceDd800(Field source) {
       replace(source,0,source.length(),beginHserviceDd800,HSERVICE_DD_800_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceDd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceDd800,HSERVICE_DD_800_LEN);
   	
   }
   
     /**
	 * 	Update HserviceDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceDd800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHserviceDate800FieldLength() {
			return HSERVICE_DATE_800_LENGTH;
		}

}
  
