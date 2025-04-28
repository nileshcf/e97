package com.cloudframe.app.ms00d363.dto;

/**
*  The class HeadingLine1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HeadingLine1 extends HeadingLine1Serialized { 
   

						private char[] hd11Cc = new char[1];

						private char[] hd11ProgName = new char[10];



	
	/**
	* Constructor for HeadingLine1
	**/
    public HeadingLine1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HeadingLine1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HeadingLine1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHd11Cc(("1").toCharArray());
								setHd11ProgName(("SWCHD363  ").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(46)
             , getStartOffset() + 11
             ,46
             );
       replaceValue( // serialize and save the value
             ("MASTERCARD DEBIT SWITCH").toCharArray()
             , getStartOffset() + 57
             ,23
             );
       replaceValue( // serialize and save the value
             fillSpace(53)
             , getStartOffset() + 80
             ,53
             );
    } 

	/**
	 *	Returns the value of hd11Cc
	 *	@return hd11Cc
	 */
   public char[] getHd11Cc() throws CFException{
     if (isHd11CcModified()) { 
        hd11Cc = refreshHd11Cc();
     }
   		return hd11Cc;
   }

  
	/**
	*  set variable hd11Cc
	*  Corresponding COBOL Variable is HD1-1-CC
	*  @param value
	**/
   public void setHd11Cc(char[] value) {
      hd11Cc = checkHd11CcConstraints(value);
      serializeHd11Cc(hd11Cc);
   } 

     /**
	 * 	Update Hd11Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd11Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd11Cc,hd11Cc.length);
   	
   }
   
   public void setHd11Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd11Cc,hd11Cc.length);
   	
   }
   
     /**
	 * 	Update Hd11Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd11Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd11Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd11Cc with another Field
	 *	@param value
	 */
   public void setHd11Cc(Field source) {
       replace(source,0,source.length(),beginHd11Cc,HD_11_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd11Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd11Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd11Cc,HD_11_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd11Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd11Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd11Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd11ProgName
	 *	@return hd11ProgName
	 */
   public char[] getHd11ProgName() throws CFException{
     if (isHd11ProgNameModified()) { 
        hd11ProgName = refreshHd11ProgName();
     }
   		return hd11ProgName;
   }

  
	/**
	*  set variable hd11ProgName
	*  Corresponding COBOL Variable is HD1-1-PROG-NAME
	*  @param value
	**/
   public void setHd11ProgName(char[] value) {
      hd11ProgName = checkHd11ProgNameConstraints(value);
      serializeHd11ProgName(hd11ProgName);
   } 

     /**
	 * 	Update Hd11ProgName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd11ProgName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd11ProgName,hd11ProgName.length);
   	
   }
   
   public void setHd11ProgName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd11ProgName,hd11ProgName.length);
   	
   }
   
     /**
	 * 	Update Hd11ProgName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd11ProgName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd11ProgName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd11ProgName with another Field
	 *	@param value
	 */
   public void setHd11ProgName(Field source) {
       replace(source,0,source.length(),beginHd11ProgName,HD_11_PROG_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Hd11ProgName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd11ProgName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd11ProgName,HD_11_PROG_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Hd11ProgName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd11ProgName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd11ProgName+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHeadingLine1FieldLength() {
			return HEADING_LINE_1_LENGTH;
		}

}
  
