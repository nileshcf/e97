package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66605IpmFileInformation is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip66605IpmFileInformation extends Ip66605IpmFileInformationSerialized { 
   

						private char[] ip66605IsIpmFileFinished = Field.fillLowValue(1);

						private char[] ip66605IsIpmFileTagged = Field.fillLowValue(1);

						private char[] ip66605WriteToFileSw = Field.fillLowValue(1);

						private char[] ip66605DoIWrite800Pdses = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip66605IpmFileInformation
	**/
    public Ip66605IpmFileInformation() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip66605IpmFileInformation. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66605IpmFileInformation(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip66605IsIpmFileFinished
	 *	@return ip66605IsIpmFileFinished
	 */
   public char[] getIp66605IsIpmFileFinished() throws CFException{
     if (isIp66605IsIpmFileFinishedModified()) { 
        ip66605IsIpmFileFinished = refreshIp66605IsIpmFileFinished();
     }
   		return ip66605IsIpmFileFinished;
   }

  
	/**
	*  set variable ip66605IsIpmFileFinished
	*  Corresponding COBOL Variable is IP66605-IS-IPM-FILE-FINISHED
	*  @param value
	**/
   public void setIp66605IsIpmFileFinished(char[] value) {
      ip66605IsIpmFileFinished = checkIp66605IsIpmFileFinishedConstraints(value);
      serializeIp66605IsIpmFileFinished(ip66605IsIpmFileFinished);
   } 

     /**
	 * 	Update Ip66605IsIpmFileFinished 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66605IsIpmFileFinished(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66605IsIpmFileFinished,ip66605IsIpmFileFinished.length);
   	
   }
   
   public void setIp66605IsIpmFileFinished(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605IsIpmFileFinished,ip66605IsIpmFileFinished.length);
   	
   }
   
     /**
	 * 	Update Ip66605IsIpmFileFinished 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66605IsIpmFileFinished(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605IsIpmFileFinished+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66605IsIpmFileFinished with another Field
	 *	@param value
	 */
   public void setIp66605IsIpmFileFinished(Field source) {
       replace(source,0,source.length(),beginIp66605IsIpmFileFinished,IP_66605_IS_IPM_FILE_FINISHED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66605IsIpmFileFinished 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66605IsIpmFileFinished(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66605IsIpmFileFinished,IP_66605_IS_IPM_FILE_FINISHED_LEN);
   	
   }
   
     /**
	 * 	Update Ip66605IsIpmFileFinished 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66605IsIpmFileFinished(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605IsIpmFileFinished+targetIndex,targetLen);
    
   }
	char[] ip66605IpmFileIsFinished88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp66605IpmFileIsFinished()
	 *	@return  Returns true if isIp66605IpmFileIsFinished() is "Y"
	 */
   public boolean isIp66605IpmFileIsFinished() throws CFException {
      return (  compareChars( getIp66605IsIpmFileFinished() , ip66605IpmFileIsFinished88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp66605IpmFileIsFinishedTrue() {  			
    	setIp66605IsIpmFileFinished( ip66605IpmFileIsFinished88Value);
   	}
	/**
	 *	Returns the value of ip66605IsIpmFileTagged
	 *	@return ip66605IsIpmFileTagged
	 */
   public char[] getIp66605IsIpmFileTagged() throws CFException{
     if (isIp66605IsIpmFileTaggedModified()) { 
        ip66605IsIpmFileTagged = refreshIp66605IsIpmFileTagged();
     }
   		return ip66605IsIpmFileTagged;
   }

  
	/**
	*  set variable ip66605IsIpmFileTagged
	*  Corresponding COBOL Variable is IP66605-IS-IPM-FILE-TAGGED
	*  @param value
	**/
   public void setIp66605IsIpmFileTagged(char[] value) {
      ip66605IsIpmFileTagged = checkIp66605IsIpmFileTaggedConstraints(value);
      serializeIp66605IsIpmFileTagged(ip66605IsIpmFileTagged);
   } 

     /**
	 * 	Update Ip66605IsIpmFileTagged 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66605IsIpmFileTagged(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66605IsIpmFileTagged,ip66605IsIpmFileTagged.length);
   	
   }
   
   public void setIp66605IsIpmFileTagged(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605IsIpmFileTagged,ip66605IsIpmFileTagged.length);
   	
   }
   
     /**
	 * 	Update Ip66605IsIpmFileTagged 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66605IsIpmFileTagged(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605IsIpmFileTagged+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66605IsIpmFileTagged with another Field
	 *	@param value
	 */
   public void setIp66605IsIpmFileTagged(Field source) {
       replace(source,0,source.length(),beginIp66605IsIpmFileTagged,IP_66605_IS_IPM_FILE_TAGGED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66605IsIpmFileTagged 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66605IsIpmFileTagged(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66605IsIpmFileTagged,IP_66605_IS_IPM_FILE_TAGGED_LEN);
   	
   }
   
     /**
	 * 	Update Ip66605IsIpmFileTagged 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66605IsIpmFileTagged(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605IsIpmFileTagged+targetIndex,targetLen);
    
   }
	char[] ip66605IpmFileIsTagged88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp66605IpmFileIsTagged()
	 *	@return  Returns true if isIp66605IpmFileIsTagged() is "Y"
	 */
   public boolean isIp66605IpmFileIsTagged() throws CFException {
      return (  compareChars( getIp66605IsIpmFileTagged() , ip66605IpmFileIsTagged88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp66605IpmFileIsTaggedTrue() {  			
    	setIp66605IsIpmFileTagged( ip66605IpmFileIsTagged88Value);
   	}
	char[] ip66605IpmFileIsNormal88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isIp66605IpmFileIsNormal()
	 *	@return  Returns true if isIp66605IpmFileIsNormal() is " "
	 */
   public boolean isIp66605IpmFileIsNormal() throws CFException {
      return (  compareChars( getIp66605IsIpmFileTagged() , ip66605IpmFileIsNormal88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIp66605IpmFileIsNormalTrue() {  			
    	setIp66605IsIpmFileTagged( ip66605IpmFileIsNormal88Value);
   	}
	/**
	 *	Returns the value of ip66605WriteToFileSw
	 *	@return ip66605WriteToFileSw
	 */
   public char[] getIp66605WriteToFileSw() throws CFException{
     if (isIp66605WriteToFileSwModified()) { 
        ip66605WriteToFileSw = refreshIp66605WriteToFileSw();
     }
   		return ip66605WriteToFileSw;
   }

  
	/**
	*  set variable ip66605WriteToFileSw
	*  Corresponding COBOL Variable is IP66605-WRITE-TO-FILE-SW
	*  @param value
	**/
   public void setIp66605WriteToFileSw(char[] value) {
      ip66605WriteToFileSw = checkIp66605WriteToFileSwConstraints(value);
      serializeIp66605WriteToFileSw(ip66605WriteToFileSw);
   } 

     /**
	 * 	Update Ip66605WriteToFileSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66605WriteToFileSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66605WriteToFileSw,ip66605WriteToFileSw.length);
   	
   }
   
   public void setIp66605WriteToFileSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605WriteToFileSw,ip66605WriteToFileSw.length);
   	
   }
   
     /**
	 * 	Update Ip66605WriteToFileSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66605WriteToFileSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605WriteToFileSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66605WriteToFileSw with another Field
	 *	@param value
	 */
   public void setIp66605WriteToFileSw(Field source) {
       replace(source,0,source.length(),beginIp66605WriteToFileSw,IP_66605_WRITE_TO_FILE_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66605WriteToFileSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66605WriteToFileSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66605WriteToFileSw,IP_66605_WRITE_TO_FILE_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip66605WriteToFileSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66605WriteToFileSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605WriteToFileSw+targetIndex,targetLen);
    
   }
	char[] ip66605DoNotWriteToFile88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp66605DoNotWriteToFile()
	 *	@return  Returns true if isIp66605DoNotWriteToFile() is "N"
	 */
   public boolean isIp66605DoNotWriteToFile() throws CFException {
      return (  compareChars( getIp66605WriteToFileSw() , ip66605DoNotWriteToFile88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp66605DoNotWriteToFileTrue() {  			
    	setIp66605WriteToFileSw( ip66605DoNotWriteToFile88Value);
   	}
	/**
	 *	Returns the value of ip66605DoIWrite800Pdses
	 *	@return ip66605DoIWrite800Pdses
	 */
   public char[] getIp66605DoIWrite800Pdses() throws CFException{
     if (isIp66605DoIWrite800PdsesModified()) { 
        ip66605DoIWrite800Pdses = refreshIp66605DoIWrite800Pdses();
     }
   		return ip66605DoIWrite800Pdses;
   }

  
	/**
	*  set variable ip66605DoIWrite800Pdses
	*  Corresponding COBOL Variable is IP66605-DO-I-WRITE-800-PDSES
	*  @param value
	**/
   public void setIp66605DoIWrite800Pdses(char[] value) {
      ip66605DoIWrite800Pdses = checkIp66605DoIWrite800PdsesConstraints(value);
      serializeIp66605DoIWrite800Pdses(ip66605DoIWrite800Pdses);
   } 

     /**
	 * 	Update Ip66605DoIWrite800Pdses 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66605DoIWrite800Pdses(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66605DoIWrite800Pdses,ip66605DoIWrite800Pdses.length);
   	
   }
   
   public void setIp66605DoIWrite800Pdses(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605DoIWrite800Pdses,ip66605DoIWrite800Pdses.length);
   	
   }
   
     /**
	 * 	Update Ip66605DoIWrite800Pdses 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66605DoIWrite800Pdses(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605DoIWrite800Pdses+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66605DoIWrite800Pdses with another Field
	 *	@param value
	 */
   public void setIp66605DoIWrite800Pdses(Field source) {
       replace(source,0,source.length(),beginIp66605DoIWrite800Pdses,IP_66605_DO_IWRITE_800_PDSES_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66605DoIWrite800Pdses 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66605DoIWrite800Pdses(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66605DoIWrite800Pdses,IP_66605_DO_IWRITE_800_PDSES_LEN);
   	
   }
   
     /**
	 * 	Update Ip66605DoIWrite800Pdses 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66605DoIWrite800Pdses(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66605DoIWrite800Pdses+targetIndex,targetLen);
    
   }
	char[] ip66605Writing800Pdses88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp66605Writing800Pdses()
	 *	@return  Returns true if isIp66605Writing800Pdses() is "Y"
	 */
   public boolean isIp66605Writing800Pdses() throws CFException {
      return (  compareChars( getIp66605DoIWrite800Pdses() , ip66605Writing800Pdses88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp66605Writing800PdsesTrue() {  			
    	setIp66605DoIWrite800Pdses( ip66605Writing800Pdses88Value);
   	}
	char[] ip66605Suppressing800Pdses88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isIp66605Suppressing800Pdses()
	 *	@return  Returns true if isIp66605Suppressing800Pdses() is " "
	 */
   public boolean isIp66605Suppressing800Pdses() throws CFException {
      return (  compareChars( getIp66605DoIWrite800Pdses() , ip66605Suppressing800Pdses88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIp66605Suppressing800PdsesTrue() {  			
    	setIp66605DoIWrite800Pdses( ip66605Suppressing800Pdses88Value);
   	}

	
	
	
	/**
	 * 	initializes Ip66605IpmFileInformation
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66605IsIpmFileFinished(CONSTANTS.SPACE);
         setIp66605IsIpmFileTagged(CONSTANTS.SPACE);
         setIp66605WriteToFileSw(CONSTANTS.SPACE);
         setIp66605DoIWrite800Pdses(CONSTANTS.SPACE);
   }

		public static int getIp66605IpmFileInformationFieldLength() {
			return IP_66605_IPM_FILE_INFORMATION_LENGTH;
		}

}
  
