package com.cloudframe.app.sf328010.dto;

/**
*  The class LserviceDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LserviceDate800 extends LserviceDate800Serialized { 
   

						private char[] lserviceCc800 = new char[2];

						private char[] lserviceYy800 = new char[2];

						private char[] lserviceMm800 = new char[2];

						private char[] lserviceDd800 = new char[2];
	
	/**
	* Constructor for LserviceDate800
	**/
    public LserviceDate800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LserviceDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LserviceDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLserviceCc800(fillSpace(2));
								setLserviceYy800(fillSpace(2));
								setLserviceMm800(fillSpace(2));
								setLserviceDd800(fillSpace(2));
    } 

	/**
	 *	Returns the value of lserviceCc800
	 *	@return lserviceCc800
	 */
   public char[] getLserviceCc800() throws CFException{
     if (isLserviceCc800Modified()) { 
        lserviceCc800 = refreshLserviceCc800();
     }
   		return lserviceCc800;
   }

  
	/**
	*  set variable lserviceCc800
	*  Corresponding COBOL Variable is 800-LSERVICE-CC
	*  @param value
	**/
   public void setLserviceCc800(char[] value) {
      lserviceCc800 = checkLserviceCc800Constraints(value);
      serializeLserviceCc800(lserviceCc800);
   } 

     /**
	 * 	Update LserviceCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceCc800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceCc800,lserviceCc800.length);
   	
   }
   
   public void setLserviceCc800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceCc800,lserviceCc800.length);
   	
   }
   
     /**
	 * 	Update LserviceCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceCc800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceCc800 with another Field
	 *	@param value
	 */
   public void setLserviceCc800(Field source) {
       replace(source,0,source.length(),beginLserviceCc800,LSERVICE_CC_800_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceCc800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceCc800,LSERVICE_CC_800_LEN);
   	
   }
   
     /**
	 * 	Update LserviceCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceCc800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceYy800
	 *	@return lserviceYy800
	 */
   public char[] getLserviceYy800() throws CFException{
     if (isLserviceYy800Modified()) { 
        lserviceYy800 = refreshLserviceYy800();
     }
   		return lserviceYy800;
   }

  
	/**
	*  set variable lserviceYy800
	*  Corresponding COBOL Variable is 800-LSERVICE-YY
	*  @param value
	**/
   public void setLserviceYy800(char[] value) {
      lserviceYy800 = checkLserviceYy800Constraints(value);
      serializeLserviceYy800(lserviceYy800);
   } 

     /**
	 * 	Update LserviceYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceYy800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceYy800,lserviceYy800.length);
   	
   }
   
   public void setLserviceYy800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceYy800,lserviceYy800.length);
   	
   }
   
     /**
	 * 	Update LserviceYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceYy800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceYy800 with another Field
	 *	@param value
	 */
   public void setLserviceYy800(Field source) {
       replace(source,0,source.length(),beginLserviceYy800,LSERVICE_YY_800_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceYy800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceYy800,LSERVICE_YY_800_LEN);
   	
   }
   
     /**
	 * 	Update LserviceYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceYy800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceMm800
	 *	@return lserviceMm800
	 */
   public char[] getLserviceMm800() throws CFException{
     if (isLserviceMm800Modified()) { 
        lserviceMm800 = refreshLserviceMm800();
     }
   		return lserviceMm800;
   }

  
	/**
	*  set variable lserviceMm800
	*  Corresponding COBOL Variable is 800-LSERVICE-MM
	*  @param value
	**/
   public void setLserviceMm800(char[] value) {
      lserviceMm800 = checkLserviceMm800Constraints(value);
      serializeLserviceMm800(lserviceMm800);
   } 

     /**
	 * 	Update LserviceMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMm800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceMm800,lserviceMm800.length);
   	
   }
   
   public void setLserviceMm800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMm800,lserviceMm800.length);
   	
   }
   
     /**
	 * 	Update LserviceMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMm800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceMm800 with another Field
	 *	@param value
	 */
   public void setLserviceMm800(Field source) {
       replace(source,0,source.length(),beginLserviceMm800,LSERVICE_MM_800_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMm800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceMm800,LSERVICE_MM_800_LEN);
   	
   }
   
     /**
	 * 	Update LserviceMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMm800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceDd800
	 *	@return lserviceDd800
	 */
   public char[] getLserviceDd800() throws CFException{
     if (isLserviceDd800Modified()) { 
        lserviceDd800 = refreshLserviceDd800();
     }
   		return lserviceDd800;
   }

  
	/**
	*  set variable lserviceDd800
	*  Corresponding COBOL Variable is 800-LSERVICE-DD
	*  @param value
	**/
   public void setLserviceDd800(char[] value) {
      lserviceDd800 = checkLserviceDd800Constraints(value);
      serializeLserviceDd800(lserviceDd800);
   } 

     /**
	 * 	Update LserviceDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceDd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceDd800,lserviceDd800.length);
   	
   }
   
   public void setLserviceDd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceDd800,lserviceDd800.length);
   	
   }
   
     /**
	 * 	Update LserviceDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceDd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceDd800 with another Field
	 *	@param value
	 */
   public void setLserviceDd800(Field source) {
       replace(source,0,source.length(),beginLserviceDd800,LSERVICE_DD_800_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceDd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceDd800,LSERVICE_DD_800_LEN);
   	
   }
   
     /**
	 * 	Update LserviceDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceDd800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLserviceDate800FieldLength() {
			return LSERVICE_DATE_800_LENGTH;
		}

}
  
