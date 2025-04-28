package com.cloudframe.app.ip809050.dto;

/**
*  The class CbhRefNum1800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CbhRefNum1800 extends CbhRefNum1800Serialized { 
   


						private char[] cbhRefNum800 = new char[10];

	
	/**
	* Constructor for CbhRefNum1800
	**/
    public CbhRefNum1800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CbhRefNum1800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CbhRefNum1800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 0
             ,1
             );
								setCbhRefNum800("0000000000".toCharArray());
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 11
             ,1
             );
    } 

	/**
	 *	Returns the value of cbhRefNum800
	 *	@return cbhRefNum800
	 */
   public char[] getCbhRefNum800() throws CFException{
     if (isCbhRefNum800Modified()) { 
        cbhRefNum800 = refreshCbhRefNum800();
     }
   		return cbhRefNum800;
   }

  
	/**
	*  set variable cbhRefNum800
	*  Corresponding COBOL Variable is 800-CBH-REF-NUM
	*  @param value
	**/
   public void setCbhRefNum800(char[] value) {
      cbhRefNum800 = checkCbhRefNum800Constraints(value);
      serializeCbhRefNum800(cbhRefNum800);
   } 

     /**
	 * 	Update CbhRefNum800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCbhRefNum800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCbhRefNum800,cbhRefNum800.length);
   	
   }
   
   public void setCbhRefNum800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCbhRefNum800,cbhRefNum800.length);
   	
   }
   
     /**
	 * 	Update CbhRefNum800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCbhRefNum800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCbhRefNum800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CbhRefNum800 with another Field
	 *	@param value
	 */
   public void setCbhRefNum800(Field source) {
       replace(source,0,source.length(),beginCbhRefNum800,CBH_REF_NUM_800_LEN);
   	
   }  
   
     /**
	 * 	Update CbhRefNum800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCbhRefNum800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCbhRefNum800,CBH_REF_NUM_800_LEN);
   	
   }
   
     /**
	 * 	Update CbhRefNum800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCbhRefNum800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCbhRefNum800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCbhRefNum1800FieldLength() {
			return CBH_REF_NUM_1800_LENGTH;
		}

}
  
