package com.cloudframe.app.ar640010.dto;

/**
*  The class ExecutionOptions1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExecutionOptions1000 extends ExecutionOptions1000Serialized { 
   

						private char[] displayOption1000 = new char[1];

						private char[] doNothingOption1000 = new char[1];

						private char[] dsnLengthOption1000 = new char[1];

	
	/**
	* Constructor for ExecutionOptions1000
	**/
    public ExecutionOptions1000() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ExecutionOptions1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExecutionOptions1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDisplayOption1000(("N").toCharArray());
								setDoNothingOption1000(fillSpace(1));
								setDsnLengthOption1000(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 3
             ,1
             );
    } 

	/**
	 *	Returns the value of displayOption1000
	 *	@return displayOption1000
	 */
   public char[] getDisplayOption1000() throws CFException{
     if (isDisplayOption1000Modified()) { 
        displayOption1000 = refreshDisplayOption1000();
     }
   		return displayOption1000;
   }

  
	/**
	*  set variable displayOption1000
	*  Corresponding COBOL Variable is 1000-DISPLAY-OPTION
	*  @param value
	**/
   public void setDisplayOption1000(char[] value) {
      displayOption1000 = checkDisplayOption1000Constraints(value);
      serializeDisplayOption1000(displayOption1000);
   } 

     /**
	 * 	Update DisplayOption1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayOption1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDisplayOption1000,displayOption1000.length);
   	
   }
   
   public void setDisplayOption1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayOption1000,displayOption1000.length);
   	
   }
   
     /**
	 * 	Update DisplayOption1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayOption1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayOption1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DisplayOption1000 with another Field
	 *	@param value
	 */
   public void setDisplayOption1000(Field source) {
       replace(source,0,source.length(),beginDisplayOption1000,DISPLAY_OPTION_1000_LEN);
   	
   }  
   
     /**
	 * 	Update DisplayOption1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayOption1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDisplayOption1000,DISPLAY_OPTION_1000_LEN);
   	
   }
   
     /**
	 * 	Update DisplayOption1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayOption1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayOption1000+targetIndex,targetLen);
    
   }
	char[] displayAll88100088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDisplayAll881000()
	 *	@return  Returns true if isDisplayAll881000() is "Y"
	 */
   public boolean isDisplayAll881000() throws CFException {
      return (  compareChars( getDisplayOption1000() , displayAll88100088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDisplayAll881000True() {  			
    	setDisplayOption1000( displayAll88100088Value);
   	}
	/**
	 *	Returns the value of doNothingOption1000
	 *	@return doNothingOption1000
	 */
   public char[] getDoNothingOption1000() throws CFException{
     if (isDoNothingOption1000Modified()) { 
        doNothingOption1000 = refreshDoNothingOption1000();
     }
   		return doNothingOption1000;
   }

  
	/**
	*  set variable doNothingOption1000
	*  Corresponding COBOL Variable is 1000-DO-NOTHING-OPTION
	*  @param value
	**/
   public void setDoNothingOption1000(char[] value) {
      doNothingOption1000 = checkDoNothingOption1000Constraints(value);
      serializeDoNothingOption1000(doNothingOption1000);
   } 

     /**
	 * 	Update DoNothingOption1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDoNothingOption1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDoNothingOption1000,doNothingOption1000.length);
   	
   }
   
   public void setDoNothingOption1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDoNothingOption1000,doNothingOption1000.length);
   	
   }
   
     /**
	 * 	Update DoNothingOption1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDoNothingOption1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDoNothingOption1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DoNothingOption1000 with another Field
	 *	@param value
	 */
   public void setDoNothingOption1000(Field source) {
       replace(source,0,source.length(),beginDoNothingOption1000,DO_NOTHING_OPTION_1000_LEN);
   	
   }  
   
     /**
	 * 	Update DoNothingOption1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDoNothingOption1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDoNothingOption1000,DO_NOTHING_OPTION_1000_LEN);
   	
   }
   
     /**
	 * 	Update DoNothingOption1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDoNothingOption1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDoNothingOption1000+targetIndex,targetLen);
    
   }
	char[] doNothingExit88100088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDoNothingExit881000()
	 *	@return  Returns true if isDoNothingExit881000() is "Y"
	 */
   public boolean isDoNothingExit881000() throws CFException {
      return (  compareChars( getDoNothingOption1000() , doNothingExit88100088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDoNothingExit881000True() {  			
    	setDoNothingOption1000( doNothingExit88100088Value);
   	}
	/**
	 *	Returns the value of dsnLengthOption1000
	 *	@return dsnLengthOption1000
	 */
   public char[] getDsnLengthOption1000() throws CFException{
     if (isDsnLengthOption1000Modified()) { 
        dsnLengthOption1000 = refreshDsnLengthOption1000();
     }
   		return dsnLengthOption1000;
   }

  
	/**
	*  set variable dsnLengthOption1000
	*  Corresponding COBOL Variable is 1000-DSN-LENGTH-OPTION
	*  @param value
	**/
   public void setDsnLengthOption1000(char[] value) {
      dsnLengthOption1000 = checkDsnLengthOption1000Constraints(value);
      serializeDsnLengthOption1000(dsnLengthOption1000);
   } 

     /**
	 * 	Update DsnLengthOption1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsnLengthOption1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsnLengthOption1000,dsnLengthOption1000.length);
   	
   }
   
   public void setDsnLengthOption1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsnLengthOption1000,dsnLengthOption1000.length);
   	
   }
   
     /**
	 * 	Update DsnLengthOption1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsnLengthOption1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsnLengthOption1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsnLengthOption1000 with another Field
	 *	@param value
	 */
   public void setDsnLengthOption1000(Field source) {
       replace(source,0,source.length(),beginDsnLengthOption1000,DSN_LENGTH_OPTION_1000_LEN);
   	
   }  
   
     /**
	 * 	Update DsnLengthOption1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsnLengthOption1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsnLengthOption1000,DSN_LENGTH_OPTION_1000_LEN);
   	
   }
   
     /**
	 * 	Update DsnLengthOption1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsnLengthOption1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsnLengthOption1000+targetIndex,targetLen);
    
   }
	char[] dsnLength5488100088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDsnLength54881000()
	 *	@return  Returns true if isDsnLength54881000() is "Y"
	 */
   public boolean isDsnLength54881000() throws CFException {
      return (  compareChars( getDsnLengthOption1000() , dsnLength5488100088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDsnLength54881000True() {  			
    	setDsnLengthOption1000( dsnLength5488100088Value);
   	}

	
	
	

		public static int getExecutionOptions1000FieldLength() {
			return EXECUTION_OPTIONS_1000_LENGTH;
		}

}
  
