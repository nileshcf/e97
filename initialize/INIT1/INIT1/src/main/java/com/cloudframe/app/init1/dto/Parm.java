package com.cloudframe.app.init1.dto;

/**
*  The class Parm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Parm extends ParmSerialized { 
   

						private char[] parmType = new char[3];

						private char[] parmIdentifier = new char[3];

								private long parmThreshold;
	
	/**
	* Constructor for Parm
	**/
    public Parm() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setParmType(fillSpace(3));
								setParmIdentifier(fillSpace(3));
								setParmThreshold(0L);
    } 

	/**
	 *	Returns the value of parmType
	 *	@return parmType
	 */
   public char[] getParmType() throws CFException{
     if (isParmTypeModified()) { 
        parmType = refreshParmType();
     }
   		return parmType;
   }

  
	/**
	*  set variable parmType
	*  Corresponding COBOL Variable is WS-PARM-TYPE
	*  @param value
	**/
   public void setParmType(char[] value) {
      parmType = checkParmTypeConstraints(value);
      serializeParmType(parmType);
   } 

     /**
	 * 	Update ParmType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmType,parmType.length);
   	
   }
   
   public void setParmType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmType,parmType.length);
   	
   }
   
     /**
	 * 	Update ParmType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmType with another Field
	 *	@param value
	 */
   public void setParmType(Field source) {
       replace(source,0,source.length(),beginParmType,PARM_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update ParmType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmType,PARM_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update ParmType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmType+targetIndex,targetLen);
    
   }
	char[] jtCycle88Value = "JT#".toCharArray();
	/**
	 *	Test condition "JT#" for isJtCycle()
	 *	@return  Returns true if isJtCycle() is "JT#"
	 */
   public boolean isJtCycle() throws CFException {
      return (  compareChars( getParmType() , jtCycle88Value)  == 0  );
   }


	/**
	*  set values "JT#"
	*/
   	public void setJtCycleTrue() {  			
    	setParmType( jtCycle88Value);
   	}
	char[] jjCycle88Value = "JJ#".toCharArray();
	/**
	 *	Test condition "JJ#" for isJjCycle()
	 *	@return  Returns true if isJjCycle() is "JJ#"
	 */
   public boolean isJjCycle() throws CFException {
      return (  compareChars( getParmType() , jjCycle88Value)  == 0  );
   }


	/**
	*  set values "JJ#"
	*/
   	public void setJjCycleTrue() {  			
    	setParmType( jjCycle88Value);
   	}
	char[] rcCycle88Value = "RC#".toCharArray();
	/**
	 *	Test condition "RC#" for isRcCycle()
	 *	@return  Returns true if isRcCycle() is "RC#"
	 */
   public boolean isRcCycle() throws CFException {
      return (  compareChars( getParmType() , rcCycle88Value)  == 0  );
   }


	/**
	*  set values "RC#"
	*/
   	public void setRcCycleTrue() {  			
    	setParmType( rcCycle88Value);
   	}
	/**
	 *	Returns the value of parmIdentifier
	 *	@return parmIdentifier
	 */
   public char[] getParmIdentifier() throws CFException{
     if (isParmIdentifierModified()) { 
        parmIdentifier = refreshParmIdentifier();
     }
   		return parmIdentifier;
   }

  
	/**
	*  set variable parmIdentifier
	*  Corresponding COBOL Variable is WS-PARM-IDENTIFIER
	*  @param value
	**/
   public void setParmIdentifier(char[] value) {
      parmIdentifier = checkParmIdentifierConstraints(value);
      serializeParmIdentifier(parmIdentifier);
   } 

     /**
	 * 	Update ParmIdentifier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmIdentifier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmIdentifier,parmIdentifier.length);
   	
   }
   
   public void setParmIdentifier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmIdentifier,parmIdentifier.length);
   	
   }
   
     /**
	 * 	Update ParmIdentifier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmIdentifier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmIdentifier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmIdentifier with another Field
	 *	@param value
	 */
   public void setParmIdentifier(Field source) {
       replace(source,0,source.length(),beginParmIdentifier,PARM_IDENTIFIER_LEN);
   	
   }  
   
     /**
	 * 	Update ParmIdentifier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmIdentifier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmIdentifier,PARM_IDENTIFIER_LEN);
   	
   }
   
     /**
	 * 	Update ParmIdentifier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmIdentifier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmIdentifier+targetIndex,targetLen);
    
   }
	char[] overrideThreshold88Value = "OVR".toCharArray();
	/**
	 *	Test condition "OVR" for isOverrideThreshold()
	 *	@return  Returns true if isOverrideThreshold() is "OVR"
	 */
   public boolean isOverrideThreshold() throws CFException {
      return (  compareChars( getParmIdentifier() , overrideThreshold88Value)  == 0  );
   }


	/**
	*  set values "OVR"
	*/
   	public void setOverrideThresholdTrue() {  			
    	setParmIdentifier( overrideThreshold88Value);
   	}
	/**
	 *	Returns the value of parmThreshold
	 *	@return parmThreshold
	 */
	public long getParmThreshold() throws CFException {
       if (isParmThresholdModified()) { 
           parmThreshold = refreshParmThreshold();
        }
   		return parmThreshold;
	}
	

	
	   
	/**
	 * 	Update ParmThreshold with the passed value
	 *  Corresponding COBOL Variable is WS-PARM-THRESHOLD
	 *	@param number
	 */
	public void setParmThreshold(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    parmThreshold = checkParmThresholdMaxLimit(number); 
		serializeParmThreshold(parmThreshold);
	}
	

	/**
	 * 	Update ParmThreshold with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmThreshold(char[] value) throws CFException {
		 parmThreshold = serializeParmThreshold(value);
	}
	/**
	 * 	Update ParmThreshold with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmThresholdString(char[] value) throws CFException {
		 setParmThreshold(value);
	}

	
	
	
	/**
	 * 	initializes Parm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setParmType(CONSTANTS.SPACE_3);
         setParmIdentifier(CONSTANTS.SPACE_3);
                     setParmThreshold(0);
   }

		public static int getParmFieldLength() {
			return PARM_LENGTH;
		}

}
  
