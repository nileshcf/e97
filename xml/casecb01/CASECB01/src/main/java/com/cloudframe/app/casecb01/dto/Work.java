package com.cloudframe.app.casecb01.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.casecb01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private short s1;

								private short s2;

								private short s3;

								private short s4;

								private char[] edit = Field.fillLowValue(5);

						private char[] xml = Field.fillLowValue(30000);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setS1((short)0);
								setS2((short)0);
								setS3((short)0);
								setS4((short)0);
    }


 

	/**
	 *	Returns the value of s1
	 *	@return s1
	 */
	public short getS1() throws CFException {
   		return s1;
	}
	
	/**
	 * 	Update S1 with the passed value
	 *  Corresponding COBOL Variable is S1
	 *	@param number
	 */
	public void setS1(short number) {
	     // Truncate if the number is beyond +/- Max range
	    s1 = checkS1MaxLimit(number); 
	}

	public void setS1(int number) {
	    number = checkS1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setS1((short)number);
	}
	public void setS1(long number) {
	    number = checkS1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setS1((short)number);
	}
	

	/**
	 *	Returns the value of s2
	 *	@return s2
	 */
	public short getS2() throws CFException {
   		return s2;
	}
	
	/**
	 * 	Update S2 with the passed value
	 *  Corresponding COBOL Variable is S2
	 *	@param number
	 */
	public void setS2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    s2 = checkS2MaxLimit(number); 
	}

	public void setS2(int number) {
	    number = checkS2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setS2((short)number);
	}
	public void setS2(long number) {
	    number = checkS2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setS2((short)number);
	}
	

	/**
	 *	Returns the value of s3
	 *	@return s3
	 */
	public short getS3() throws CFException {
   		return s3;
	}
	
	/**
	 * 	Update S3 with the passed value
	 *  Corresponding COBOL Variable is S3
	 *	@param number
	 */
	public void setS3(short number) {
	     // Truncate if the number is beyond +/- Max range
	    s3 = checkS3MaxLimit(number); 
	}

	public void setS3(int number) {
	    number = checkS3MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setS3((short)number);
	}
	public void setS3(long number) {
	    number = checkS3MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setS3((short)number);
	}
	

	/**
	 *	Returns the value of s4
	 *	@return s4
	 */
	public short getS4() throws CFException {
   		return s4;
	}
	
	/**
	 * 	Update S4 with the passed value
	 *  Corresponding COBOL Variable is S4
	 *	@param number
	 */
	public void setS4(short number) {
	     // Truncate if the number is beyond +/- Max range
	    s4 = checkS4MaxLimit(number); 
	}

	public void setS4(int number) {
	    number = checkS4MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setS4((short)number);
	}
	public void setS4(long number) {
	    number = checkS4MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setS4((short)number);
	}
	

	/**
	 *	Returns the value of edit
	 *	@return edit
	 */
   public char[] getEdit() throws CFException{
     if (isEditModified()) { 
        edit = refreshEdit();
     }
   		return edit;
   }

  
	/**
	*  set variable edit
	*  Corresponding COBOL Variable is WS-EDIT
	*  @param value
	**/
   public void setEdit(char[] value) {
      edit = checkEditConstraints(value);
      serializeEdit(edit);
   } 

     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEdit,edit.length);
   	
   }
   
   public void setEdit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEdit,edit.length);
   	
   }
   
     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEdit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Edit with another Field
	 *	@param value
	 */
   public void setEdit(Field source) {
       replace(source,0,source.length(),beginEdit,EDIT_LEN);
   	
   }  
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEdit,EDIT_LEN);
   	
   }
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEdit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xml
	 *	@return xml
	 */
   public char[] getXml() throws CFException{
   		return xml;
   }

  
	/**
	*  set variable xml
	*  Corresponding COBOL Variable is WS-XML
	*  @param value
	**/
   public void setXml(char[] value) {
       value = checkXmlConstraints(value);
       arraycopy(value,0,xml,0,value.length);
   } 
	public void setXml(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,xml,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
