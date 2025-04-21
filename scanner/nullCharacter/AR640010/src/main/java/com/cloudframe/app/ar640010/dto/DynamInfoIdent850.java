package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamInfoIdent850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DynamInfoIdent850 extends DynamInfoIdent850Serialized { 
   


						private char[] dynamInfoJclDd850 = new char[8];

	
	/**
	* Constructor for DynamInfoIdent850
	**/
    public DynamInfoIdent850() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DynamInfoIdent850. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamInfoIdent850(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("DD=").toCharArray()
             , getStartOffset() + 0
             ,3
             );
								setDynamInfoJclDd850(fillSpace(8));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 11
             ,1
             );
    } 

	/**
	 *	Returns the value of dynamInfoJclDd850
	 *	@return dynamInfoJclDd850
	 */
   public char[] getDynamInfoJclDd850() throws CFException{
     if (isDynamInfoJclDd850Modified()) { 
        dynamInfoJclDd850 = refreshDynamInfoJclDd850();
     }
   		return dynamInfoJclDd850;
   }

  
	/**
	*  set variable dynamInfoJclDd850
	*  Corresponding COBOL Variable is 850-DYNAM-INFO-JCL-DD
	*  @param value
	**/
   public void setDynamInfoJclDd850(char[] value) {
      dynamInfoJclDd850 = checkDynamInfoJclDd850Constraints(value);
      serializeDynamInfoJclDd850(dynamInfoJclDd850);
   } 

     /**
	 * 	Update DynamInfoJclDd850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoJclDd850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamInfoJclDd850,dynamInfoJclDd850.length);
   	
   }
   
   public void setDynamInfoJclDd850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoJclDd850,dynamInfoJclDd850.length);
   	
   }
   
     /**
	 * 	Update DynamInfoJclDd850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoJclDd850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoJclDd850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamInfoJclDd850 with another Field
	 *	@param value
	 */
   public void setDynamInfoJclDd850(Field source) {
       replace(source,0,source.length(),beginDynamInfoJclDd850,DYNAM_INFO_JCL_DD_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamInfoJclDd850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamInfoJclDd850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamInfoJclDd850,DYNAM_INFO_JCL_DD_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamInfoJclDd850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoJclDd850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoJclDd850+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDynamInfoIdent850FieldLength() {
			return DYNAM_INFO_IDENT_850_LENGTH;
		}

}
  
