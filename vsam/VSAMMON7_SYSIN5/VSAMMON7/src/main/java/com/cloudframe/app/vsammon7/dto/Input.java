package com.cloudframe.app.vsammon7.dto;

/**
*  The class Input is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:56. using version 5.0.0.256
**/


import com.cloudframe.app.vsammon7.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Input extends InputSerialized { 
   

						private char[] inputCommand = Field.fillLowValue(7);

						private char[] inputData = Field.fillLowValue(73);
				private MethodData methodData = new MethodData();
				private ProgramData programData = new ProgramData();
				private IpaddrData ipaddrData = new IpaddrData();
				private KeyreadData keyreadData = new KeyreadData();
				private InsertData insertData = new InsertData();
				private DeleteData deleteData = new DeleteData();
	
	/**
	* Constructor for Input
	**/
    public Input() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Input. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Input(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			methodData.setParent(this,getStartOffset() + 7);
	       			programData.setParent(this,getStartOffset() + 7);
	       			ipaddrData.setParent(this,getStartOffset() + 7);
	       			keyreadData.setParent(this,getStartOffset() + 7);
	       			insertData.setParent(this,getStartOffset() + 7);
	       			deleteData.setParent(this,getStartOffset() + 7);
    } 

	/**
	 *	Returns the value of inputCommand
	 *	@return inputCommand
	 */
   public char[] getInputCommand() throws CFException{
     if (isInputCommandModified()) { 
        inputCommand = refreshInputCommand();
     }
   		return inputCommand;
   }

  
	/**
	*  set variable inputCommand
	*  Corresponding COBOL Variable is WS-INPUT-COMMAND
	*  @param value
	**/
   public void setInputCommand(char[] value) {
      inputCommand = checkInputCommandConstraints(value);
      serializeInputCommand(inputCommand);
   } 

     /**
	 * 	Update InputCommand 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputCommand(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputCommand,inputCommand.length);
   	
   }
   
   public void setInputCommand(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputCommand,inputCommand.length);
   	
   }
   
     /**
	 * 	Update InputCommand 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputCommand(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputCommand+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputCommand with another Field
	 *	@param value
	 */
   public void setInputCommand(Field source) {
       replace(source,0,source.length(),beginInputCommand,INPUT_COMMAND_LEN);
   	
   }  
   
     /**
	 * 	Update InputCommand 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputCommand(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputCommand,INPUT_COMMAND_LEN);
   	
   }
   
     /**
	 * 	Update InputCommand 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputCommand(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputCommand+targetIndex,targetLen);
    
   }
	char[] cMethod88Value = "METHOD ".toCharArray();
	/**
	 *	Test condition "METHOD " for isCMethod()
	 *	@return  Returns true if isCMethod() is "METHOD "
	 */
   public boolean isCMethod() throws CFException {
      return (  compareChars( getInputCommand() , cMethod88Value)  == 0  );
   }


	/**
	*  set values "METHOD "
	*/
   	public void setCMethodTrue() {  			
    	setInputCommand( cMethod88Value);
   	}
	char[] cProgram88Value = "PROGRM ".toCharArray();
	/**
	 *	Test condition "PROGRM " for isCProgram()
	 *	@return  Returns true if isCProgram() is "PROGRM "
	 */
   public boolean isCProgram() throws CFException {
      return (  compareChars( getInputCommand() , cProgram88Value)  == 0  );
   }


	/**
	*  set values "PROGRM "
	*/
   	public void setCProgramTrue() {  			
    	setInputCommand( cProgram88Value);
   	}
	char[] cIpaddr88Value = "IPADDR ".toCharArray();
	/**
	 *	Test condition "IPADDR " for isCIpaddr()
	 *	@return  Returns true if isCIpaddr() is "IPADDR "
	 */
   public boolean isCIpaddr() throws CFException {
      return (  compareChars( getInputCommand() , cIpaddr88Value)  == 0  );
   }


	/**
	*  set values "IPADDR "
	*/
   	public void setCIpaddrTrue() {  			
    	setInputCommand( cIpaddr88Value);
   	}
	char[] cKeyread88Value = "KYREAD ".toCharArray();
	/**
	 *	Test condition "KYREAD " for isCKeyread()
	 *	@return  Returns true if isCKeyread() is "KYREAD "
	 */
   public boolean isCKeyread() throws CFException {
      return (  compareChars( getInputCommand() , cKeyread88Value)  == 0  );
   }


	/**
	*  set values "KYREAD "
	*/
   	public void setCKeyreadTrue() {  			
    	setInputCommand( cKeyread88Value);
   	}
	char[] cStartp88Value = "STARTP ".toCharArray();
	/**
	 *	Test condition "STARTP " for isCStartp()
	 *	@return  Returns true if isCStartp() is "STARTP "
	 */
   public boolean isCStartp() throws CFException {
      return (  compareChars( getInputCommand() , cStartp88Value)  == 0  );
   }


	/**
	*  set values "STARTP "
	*/
   	public void setCStartpTrue() {  			
    	setInputCommand( cStartp88Value);
   	}
	char[] cStarta88Value = "STARTA ".toCharArray();
	/**
	 *	Test condition "STARTA " for isCStarta()
	 *	@return  Returns true if isCStarta() is "STARTA "
	 */
   public boolean isCStarta() throws CFException {
      return (  compareChars( getInputCommand() , cStarta88Value)  == 0  );
   }


	/**
	*  set values "STARTA "
	*/
   	public void setCStartaTrue() {  			
    	setInputCommand( cStarta88Value);
   	}
	char[] cReadnxt88Value = "READNXT".toCharArray();
	/**
	 *	Test condition "READNXT" for isCReadnxt()
	 *	@return  Returns true if isCReadnxt() is "READNXT"
	 */
   public boolean isCReadnxt() throws CFException {
      return (  compareChars( getInputCommand() , cReadnxt88Value)  == 0  );
   }


	/**
	*  set values "READNXT"
	*/
   	public void setCReadnxtTrue() {  			
    	setInputCommand( cReadnxt88Value);
   	}
	char[] cRn999988Value = "RN9999 ".toCharArray();
	/**
	 *	Test condition "RN9999 " for isCRn9999()
	 *	@return  Returns true if isCRn9999() is "RN9999 "
	 */
   public boolean isCRn9999() throws CFException {
      return (  compareChars( getInputCommand() , cRn999988Value)  == 0  );
   }


	/**
	*  set values "RN9999 "
	*/
   	public void setCRn9999True() {  			
    	setInputCommand( cRn999988Value);
   	}
	char[] cInsert88Value = "INSERT ".toCharArray();
	/**
	 *	Test condition "INSERT " for isCInsert()
	 *	@return  Returns true if isCInsert() is "INSERT "
	 */
   public boolean isCInsert() throws CFException {
      return (  compareChars( getInputCommand() , cInsert88Value)  == 0  );
   }


	/**
	*  set values "INSERT "
	*/
   	public void setCInsertTrue() {  			
    	setInputCommand( cInsert88Value);
   	}
	char[] cDelete88Value = "DELETE ".toCharArray();
	/**
	 *	Test condition "DELETE " for isCDelete()
	 *	@return  Returns true if isCDelete() is "DELETE "
	 */
   public boolean isCDelete() throws CFException {
      return (  compareChars( getInputCommand() , cDelete88Value)  == 0  );
   }


	/**
	*  set values "DELETE "
	*/
   	public void setCDeleteTrue() {  			
    	setInputCommand( cDelete88Value);
   	}
	char[] cTerminate88Value = "*END*  ".toCharArray();
	/**
	 *	Test condition "*END*  " for isCTerminate()
	 *	@return  Returns true if isCTerminate() is "*END*  "
	 */
   public boolean isCTerminate() throws CFException {
      return (  compareChars( getInputCommand() , cTerminate88Value)  == 0  );
   }


	/**
	*  set values "*END*  "
	*/
   	public void setCTerminateTrue() {  			
    	setInputCommand( cTerminate88Value);
   	}
	/**
	 *	Returns the value of inputData
	 *	@return inputData
	 */
   public char[] getInputData() throws CFException{
     if (isInputDataModified()) { 
        inputData = refreshInputData();
     }
   		return inputData;
   }

  
	/**
	*  set variable inputData
	*  Corresponding COBOL Variable is WS-INPUT-DATA
	*  @param value
	**/
   public void setInputData(char[] value) {
      inputData = checkInputDataConstraints(value);
      serializeInputData(inputData);
   } 

     /**
	 * 	Update InputData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputData,inputData.length);
   	
   }
   
   public void setInputData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputData,inputData.length);
   	
   }
   
     /**
	 * 	Update InputData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputData with another Field
	 *	@param value
	 */
   public void setInputData(Field source) {
       replace(source,0,source.length(),beginInputData,INPUT_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update InputData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputData,INPUT_DATA_LEN);
   	
   }
   
     /**
	 * 	Update InputData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of methodData
	 *	@return methodData
	 */   
	 public MethodData getMethodData() {
   	return methodData;
   }
   /**
	* 	Update MethodData with the passed value
	*   Corresponding COBOL Variable is WS-METHOD-DATA
	*	@param value
	*/
   public void setMethodData(char[] value) {
      methodData.setString(value); 
   }   
    
     /**
	 * 	Update MethodData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMethodData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,methodData.begin,methodData.length());
   }
   
     /**
	 * 	Update MethodData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMethodData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,methodData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MethodData with another Field
	 *	@param value
	 */
   public void setMethodData(Field source) {
   	replace(source,0,source.length(),methodData.begin,methodData.length());
   }  
   
     /**
	 * 	Update MethodData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMethodData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,methodData.begin,methodData.length());
   }
   
     /**
	 * 	Update MethodData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMethodData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,methodData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of programData
	 *	@return programData
	 */   
	 public ProgramData getProgramData() {
   	return programData;
   }
   /**
	* 	Update ProgramData with the passed value
	*   Corresponding COBOL Variable is WS-PROGRAM-DATA
	*	@param value
	*/
   public void setProgramData(char[] value) {
      programData.setString(value); 
   }   
    
     /**
	 * 	Update ProgramData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setProgramData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,programData.begin,programData.length());
   }
   
     /**
	 * 	Update ProgramData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProgramData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,programData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ProgramData with another Field
	 *	@param value
	 */
   public void setProgramData(Field source) {
   	replace(source,0,source.length(),programData.begin,programData.length());
   }  
   
     /**
	 * 	Update ProgramData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setProgramData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,programData.begin,programData.length());
   }
   
     /**
	 * 	Update ProgramData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProgramData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,programData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ipaddrData
	 *	@return ipaddrData
	 */   
	 public IpaddrData getIpaddrData() {
   	return ipaddrData;
   }
   /**
	* 	Update IpaddrData with the passed value
	*   Corresponding COBOL Variable is WS-IPADDR-DATA
	*	@param value
	*/
   public void setIpaddrData(char[] value) {
      ipaddrData.setString(value); 
   }   
    
     /**
	 * 	Update IpaddrData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIpaddrData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ipaddrData.begin,ipaddrData.length());
   }
   
     /**
	 * 	Update IpaddrData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpaddrData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ipaddrData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IpaddrData with another Field
	 *	@param value
	 */
   public void setIpaddrData(Field source) {
   	replace(source,0,source.length(),ipaddrData.begin,ipaddrData.length());
   }  
   
     /**
	 * 	Update IpaddrData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIpaddrData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ipaddrData.begin,ipaddrData.length());
   }
   
     /**
	 * 	Update IpaddrData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpaddrData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ipaddrData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyreadData
	 *	@return keyreadData
	 */   
	 public KeyreadData getKeyreadData() {
   	return keyreadData;
   }
   /**
	* 	Update KeyreadData with the passed value
	*   Corresponding COBOL Variable is WS-KEYREAD-DATA
	*	@param value
	*/
   public void setKeyreadData(char[] value) {
      keyreadData.setString(value); 
   }   
    
     /**
	 * 	Update KeyreadData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyreadData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyreadData.begin,keyreadData.length());
   }
   
     /**
	 * 	Update KeyreadData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyreadData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyreadData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyreadData with another Field
	 *	@param value
	 */
   public void setKeyreadData(Field source) {
   	replace(source,0,source.length(),keyreadData.begin,keyreadData.length());
   }  
   
     /**
	 * 	Update KeyreadData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyreadData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyreadData.begin,keyreadData.length());
   }
   
     /**
	 * 	Update KeyreadData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyreadData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyreadData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of insertData
	 *	@return insertData
	 */   
	 public InsertData getInsertData() {
   	return insertData;
   }
   /**
	* 	Update InsertData with the passed value
	*   Corresponding COBOL Variable is WS-INSERT-DATA
	*	@param value
	*/
   public void setInsertData(char[] value) {
      insertData.setString(value); 
   }   
    
     /**
	 * 	Update InsertData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInsertData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,insertData.begin,insertData.length());
   }
   
     /**
	 * 	Update InsertData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInsertData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,insertData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update InsertData with another Field
	 *	@param value
	 */
   public void setInsertData(Field source) {
   	replace(source,0,source.length(),insertData.begin,insertData.length());
   }  
   
     /**
	 * 	Update InsertData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInsertData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,insertData.begin,insertData.length());
   }
   
     /**
	 * 	Update InsertData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInsertData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,insertData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of deleteData
	 *	@return deleteData
	 */   
	 public DeleteData getDeleteData() {
   	return deleteData;
   }
   /**
	* 	Update DeleteData with the passed value
	*   Corresponding COBOL Variable is WS-DELETE-DATA
	*	@param value
	*/
   public void setDeleteData(char[] value) {
      deleteData.setString(value); 
   }   
    
     /**
	 * 	Update DeleteData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDeleteData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,deleteData.begin,deleteData.length());
   }
   
     /**
	 * 	Update DeleteData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDeleteData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,deleteData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DeleteData with another Field
	 *	@param value
	 */
   public void setDeleteData(Field source) {
   	replace(source,0,source.length(),deleteData.begin,deleteData.length());
   }  
   
     /**
	 * 	Update DeleteData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDeleteData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,deleteData.begin,deleteData.length());
   }
   
     /**
	 * 	Update DeleteData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDeleteData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,deleteData.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getInputFieldLength() {
			return INPUT_LENGTH;
		}

}
  
