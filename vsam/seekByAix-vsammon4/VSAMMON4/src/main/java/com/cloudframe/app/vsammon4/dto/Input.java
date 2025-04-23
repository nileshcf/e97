package com.cloudframe.app.vsammon4.dto;

/**
*  The class Input is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Input extends InputSerialized { 
   

						private char[] inputCommand = Field.fillLowValue(7);

						private char[] inputData = Field.fillLowValue(73);
				private OpenioData openioData = new OpenioData();
				private InsallData insallData = new InsallData();
				private InsertData insertData = new InsertData();
				private DeleteData deleteData = new DeleteData();
				private RewriteData rewriteData = new RewriteData();
				private KeyreadData keyreadData = new KeyreadData();
				private ReadallData readallData = new ReadallData();
				private StartData startData = new StartData();
	
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
	       			openioData.setParent(this,getStartOffset() + 7);
	       			insallData.setParent(this,getStartOffset() + 7);
	       			insertData.setParent(this,getStartOffset() + 7);
	       			deleteData.setParent(this,getStartOffset() + 7);
	       			rewriteData.setParent(this,getStartOffset() + 7);
	       			keyreadData.setParent(this,getStartOffset() + 7);
	       			readallData.setParent(this,getStartOffset() + 7);
	       			startData.setParent(this,getStartOffset() + 7);
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
	char[] cOpeno88Value = "OPENO  ".toCharArray();
	/**
	 *	Test condition "OPENO  " for isCOpeno()
	 *	@return  Returns true if isCOpeno() is "OPENO  "
	 */
   public boolean isCOpeno() throws CFException {
      return (  compareChars( getInputCommand() , cOpeno88Value)  == 0  );
   }


	/**
	*  set values "OPENO  "
	*/
   	public void setCOpenoTrue() {  			
    	setInputCommand( cOpeno88Value);
   	}
	char[] cCloseo88Value = "CLOSEO ".toCharArray();
	/**
	 *	Test condition "CLOSEO " for isCCloseo()
	 *	@return  Returns true if isCCloseo() is "CLOSEO "
	 */
   public boolean isCCloseo() throws CFException {
      return (  compareChars( getInputCommand() , cCloseo88Value)  == 0  );
   }


	/**
	*  set values "CLOSEO "
	*/
   	public void setCCloseoTrue() {  			
    	setInputCommand( cCloseo88Value);
   	}
	char[] cOpenio88Value = "OPENIO ".toCharArray();
	/**
	 *	Test condition "OPENIO " for isCOpenio()
	 *	@return  Returns true if isCOpenio() is "OPENIO "
	 */
   public boolean isCOpenio() throws CFException {
      return (  compareChars( getInputCommand() , cOpenio88Value)  == 0  );
   }


	/**
	*  set values "OPENIO "
	*/
   	public void setCOpenioTrue() {  			
    	setInputCommand( cOpenio88Value);
   	}
	char[] cOpenextend88Value = "OPENXT ".toCharArray();
	/**
	 *	Test condition "OPENXT " for isCOpenextend()
	 *	@return  Returns true if isCOpenextend() is "OPENXT "
	 */
   public boolean isCOpenextend() throws CFException {
      return (  compareChars( getInputCommand() , cOpenextend88Value)  == 0  );
   }


	/**
	*  set values "OPENXT "
	*/
   	public void setCOpenextendTrue() {  			
    	setInputCommand( cOpenextend88Value);
   	}
	char[] cCloseio88Value = "CLOSEIO".toCharArray();
	/**
	 *	Test condition "CLOSEIO" for isCCloseio()
	 *	@return  Returns true if isCCloseio() is "CLOSEIO"
	 */
   public boolean isCCloseio() throws CFException {
      return (  compareChars( getInputCommand() , cCloseio88Value)  == 0  );
   }


	/**
	*  set values "CLOSEIO"
	*/
   	public void setCCloseioTrue() {  			
    	setInputCommand( cCloseio88Value);
   	}
	char[] cOpeni88Value = "OPENI  ".toCharArray();
	/**
	 *	Test condition "OPENI  " for isCOpeni()
	 *	@return  Returns true if isCOpeni() is "OPENI  "
	 */
   public boolean isCOpeni() throws CFException {
      return (  compareChars( getInputCommand() , cOpeni88Value)  == 0  );
   }


	/**
	*  set values "OPENI  "
	*/
   	public void setCOpeniTrue() {  			
    	setInputCommand( cOpeni88Value);
   	}
	char[] cClosei88Value = "CLOSEI ".toCharArray();
	/**
	 *	Test condition "CLOSEI " for isCClosei()
	 *	@return  Returns true if isCClosei() is "CLOSEI "
	 */
   public boolean isCClosei() throws CFException {
      return (  compareChars( getInputCommand() , cClosei88Value)  == 0  );
   }


	/**
	*  set values "CLOSEI "
	*/
   	public void setCCloseiTrue() {  			
    	setInputCommand( cClosei88Value);
   	}
	char[] cCloseextended88Value = "CLOSEXT".toCharArray();
	/**
	 *	Test condition "CLOSEXT" for isCCloseextended()
	 *	@return  Returns true if isCCloseextended() is "CLOSEXT"
	 */
   public boolean isCCloseextended() throws CFException {
      return (  compareChars( getInputCommand() , cCloseextended88Value)  == 0  );
   }


	/**
	*  set values "CLOSEXT"
	*/
   	public void setCCloseextendedTrue() {  			
    	setInputCommand( cCloseextended88Value);
   	}
	char[] cInsall88Value = "INSALL ".toCharArray();
	/**
	 *	Test condition "INSALL " for isCInsall()
	 *	@return  Returns true if isCInsall() is "INSALL "
	 */
   public boolean isCInsall() throws CFException {
      return (  compareChars( getInputCommand() , cInsall88Value)  == 0  );
   }


	/**
	*  set values "INSALL "
	*/
   	public void setCInsallTrue() {  			
    	setInputCommand( cInsall88Value);
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
	char[] cDeleteLastRead88Value = "D_LSTRD".toCharArray();
	/**
	 *	Test condition "D_LSTRD" for isCDeleteLastRead()
	 *	@return  Returns true if isCDeleteLastRead() is "D_LSTRD"
	 */
   public boolean isCDeleteLastRead() throws CFException {
      return (  compareChars( getInputCommand() , cDeleteLastRead88Value)  == 0  );
   }


	/**
	*  set values "D_LSTRD"
	*/
   	public void setCDeleteLastReadTrue() {  			
    	setInputCommand( cDeleteLastRead88Value);
   	}
	char[] cRewrite88Value = "REWRIT ".toCharArray();
	/**
	 *	Test condition "REWRIT " for isCRewrite()
	 *	@return  Returns true if isCRewrite() is "REWRIT "
	 */
   public boolean isCRewrite() throws CFException {
      return (  compareChars( getInputCommand() , cRewrite88Value)  == 0  );
   }


	/**
	*  set values "REWRIT "
	*/
   	public void setCRewriteTrue() {  			
    	setInputCommand( cRewrite88Value);
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
	char[] cReadall88Value = "READALL".toCharArray();
	/**
	 *	Test condition "READALL" for isCReadall()
	 *	@return  Returns true if isCReadall() is "READALL"
	 */
   public boolean isCReadall() throws CFException {
      return (  compareChars( getInputCommand() , cReadall88Value)  == 0  );
   }


	/**
	*  set values "READALL"
	*/
   	public void setCReadallTrue() {  			
    	setInputCommand( cReadall88Value);
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
	char[] cDelall88Value = "DELALL ".toCharArray();
	/**
	 *	Test condition "DELALL " for isCDelall()
	 *	@return  Returns true if isCDelall() is "DELALL "
	 */
   public boolean isCDelall() throws CFException {
      return (  compareChars( getInputCommand() , cDelall88Value)  == 0  );
   }


	/**
	*  set values "DELALL "
	*/
   	public void setCDelallTrue() {  			
    	setInputCommand( cDelall88Value);
   	}
	char[] cStart88Value = "START  ".toCharArray();
	/**
	 *	Test condition "START  " for isCStart()
	 *	@return  Returns true if isCStart() is "START  "
	 */
   public boolean isCStart() throws CFException {
      return (  compareChars( getInputCommand() , cStart88Value)  == 0  );
   }


	/**
	*  set values "START  "
	*/
   	public void setCStartTrue() {  			
    	setInputCommand( cStart88Value);
   	}
	char[] cStartAlternate88Value = "START* ".toCharArray();
	/**
	 *	Test condition "START* " for isCStartAlternate()
	 *	@return  Returns true if isCStartAlternate() is "START* "
	 */
   public boolean isCStartAlternate() throws CFException {
      return (  compareChars( getInputCommand() , cStartAlternate88Value)  == 0  );
   }


	/**
	*  set values "START* "
	*/
   	public void setCStartAlternateTrue() {  			
    	setInputCommand( cStartAlternate88Value);
   	}
	char[] cComment88Value = "*      ".toCharArray();
	/**
	 *	Test condition "*      " for isCComment()
	 *	@return  Returns true if isCComment() is "*      "
	 */
   public boolean isCComment() throws CFException {
      return (  compareChars( getInputCommand() , cComment88Value)  == 0  );
   }


	/**
	*  set values "*      "
	*/
   	public void setCCommentTrue() {  			
    	setInputCommand( cComment88Value);
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
	 *	Returns the value of openioData
	 *	@return openioData
	 */   
	 public OpenioData getOpenioData() {
   	return openioData;
   }
   /**
	* 	Update OpenioData with the passed value
	*   Corresponding COBOL Variable is WS-OPENIO-DATA
	*	@param value
	*/
   public void setOpenioData(char[] value) {
      openioData.setString(value); 
   }   
    
     /**
	 * 	Update OpenioData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOpenioData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,openioData.begin,openioData.length());
   }
   
     /**
	 * 	Update OpenioData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpenioData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,openioData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update OpenioData with another Field
	 *	@param value
	 */
   public void setOpenioData(Field source) {
   	replace(source,0,source.length(),openioData.begin,openioData.length());
   }  
   
     /**
	 * 	Update OpenioData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOpenioData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,openioData.begin,openioData.length());
   }
   
     /**
	 * 	Update OpenioData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpenioData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,openioData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of insallData
	 *	@return insallData
	 */   
	 public InsallData getInsallData() {
   	return insallData;
   }
   /**
	* 	Update InsallData with the passed value
	*   Corresponding COBOL Variable is WS-INSALL-DATA
	*	@param value
	*/
   public void setInsallData(char[] value) {
      insallData.setString(value); 
   }   
    
     /**
	 * 	Update InsallData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInsallData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,insallData.begin,insallData.length());
   }
   
     /**
	 * 	Update InsallData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInsallData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,insallData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update InsallData with another Field
	 *	@param value
	 */
   public void setInsallData(Field source) {
   	replace(source,0,source.length(),insallData.begin,insallData.length());
   }  
   
     /**
	 * 	Update InsallData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInsallData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,insallData.begin,insallData.length());
   }
   
     /**
	 * 	Update InsallData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInsallData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,insallData.begin+targetIndex,targetLen);
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
	/**
	 *	Returns the value of rewriteData
	 *	@return rewriteData
	 */   
	 public RewriteData getRewriteData() {
   	return rewriteData;
   }
   /**
	* 	Update RewriteData with the passed value
	*   Corresponding COBOL Variable is WS-REWRITE-DATA
	*	@param value
	*/
   public void setRewriteData(char[] value) {
      rewriteData.setString(value); 
   }   
    
     /**
	 * 	Update RewriteData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRewriteData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rewriteData.begin,rewriteData.length());
   }
   
     /**
	 * 	Update RewriteData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRewriteData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rewriteData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RewriteData with another Field
	 *	@param value
	 */
   public void setRewriteData(Field source) {
   	replace(source,0,source.length(),rewriteData.begin,rewriteData.length());
   }  
   
     /**
	 * 	Update RewriteData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRewriteData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rewriteData.begin,rewriteData.length());
   }
   
     /**
	 * 	Update RewriteData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRewriteData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rewriteData.begin+targetIndex,targetLen);
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
	 *	Returns the value of readallData
	 *	@return readallData
	 */   
	 public ReadallData getReadallData() {
   	return readallData;
   }
   /**
	* 	Update ReadallData with the passed value
	*   Corresponding COBOL Variable is WS-READALL-DATA
	*	@param value
	*/
   public void setReadallData(char[] value) {
      readallData.setString(value); 
   }   
    
     /**
	 * 	Update ReadallData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setReadallData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,readallData.begin,readallData.length());
   }
   
     /**
	 * 	Update ReadallData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReadallData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,readallData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ReadallData with another Field
	 *	@param value
	 */
   public void setReadallData(Field source) {
   	replace(source,0,source.length(),readallData.begin,readallData.length());
   }  
   
     /**
	 * 	Update ReadallData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setReadallData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,readallData.begin,readallData.length());
   }
   
     /**
	 * 	Update ReadallData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReadallData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,readallData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of startData
	 *	@return startData
	 */   
	 public StartData getStartData() {
   	return startData;
   }
   /**
	* 	Update StartData with the passed value
	*   Corresponding COBOL Variable is WS-START-DATA
	*	@param value
	*/
   public void setStartData(char[] value) {
      startData.setString(value); 
   }   
    
     /**
	 * 	Update StartData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStartData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,startData.begin,startData.length());
   }
   
     /**
	 * 	Update StartData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStartData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,startData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StartData with another Field
	 *	@param value
	 */
   public void setStartData(Field source) {
   	replace(source,0,source.length(),startData.begin,startData.length());
   }  
   
     /**
	 * 	Update StartData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStartData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,startData.begin,startData.length());
   }
   
     /**
	 * 	Update StartData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStartData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,startData.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getInputFieldLength() {
			return INPUT_LENGTH;
		}

}
  
