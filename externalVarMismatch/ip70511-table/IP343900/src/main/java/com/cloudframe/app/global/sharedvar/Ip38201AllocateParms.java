package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip38201AllocateParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip38201AllocateParms extends Ip38201AllocateParmsSerialized { 
   

						private char[] ip38201InputOutputFileInd = Field.fillLowValue(1);

						private char[] ip38201StorageMedia = Field.fillLowValue(1);

						private char[] ip38201TapeLabelType = Field.fillLowValue(3);

								private long ip38201TapeSequenceNumber;

						private char[] ip38201DiskVolSer = Field.fillLowValue(6);
				private Ip38201SpaceParms ip38201SpaceParms = new Ip38201SpaceParms();
				private Ip38201DcbInfo ip38201DcbInfo = new Ip38201DcbInfo();

						private char[] ip38201EnvironmentIndicator = Field.fillLowValue(4);

						private char[] ip38201BulkType = Field.fillLowValue(4);

						private char[] ip38201ClearingIdentifier = Field.fillLowValue(5);

						private char[] ip38201DsnThirdQualifier = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip38201AllocateParms
	**/
    public Ip38201AllocateParms() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip38201AllocateParms. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201AllocateParms(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip38201SpaceParms.setParent(this,getStartOffset() + 11);
	       			ip38201DcbInfo.setParent(this,getStartOffset() + 23);
    } 

	/**
	 *	Returns the value of ip38201InputOutputFileInd
	 *	@return ip38201InputOutputFileInd
	 */
   public char[] getIp38201InputOutputFileInd() throws CFException{
     if (isIp38201InputOutputFileIndModified()) { 
        ip38201InputOutputFileInd = refreshIp38201InputOutputFileInd();
     }
   		return ip38201InputOutputFileInd;
   }

  
	/**
	*  set variable ip38201InputOutputFileInd
	*  Corresponding COBOL Variable is IP38201-INPUT-OUTPUT-FILE-IND
	*  @param value
	**/
   public void setIp38201InputOutputFileInd(char[] value) {
      ip38201InputOutputFileInd = checkIp38201InputOutputFileIndConstraints(value);
      serializeIp38201InputOutputFileInd(ip38201InputOutputFileInd);
   } 

     /**
	 * 	Update Ip38201InputOutputFileInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201InputOutputFileInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201InputOutputFileInd,ip38201InputOutputFileInd.length);
   	
   }
   
   public void setIp38201InputOutputFileInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201InputOutputFileInd,ip38201InputOutputFileInd.length);
   	
   }
   
     /**
	 * 	Update Ip38201InputOutputFileInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201InputOutputFileInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201InputOutputFileInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201InputOutputFileInd with another Field
	 *	@param value
	 */
   public void setIp38201InputOutputFileInd(Field source) {
       replace(source,0,source.length(),beginIp38201InputOutputFileInd,IP_38201_INPUT_OUTPUT_FILE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201InputOutputFileInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201InputOutputFileInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201InputOutputFileInd,IP_38201_INPUT_OUTPUT_FILE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201InputOutputFileInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201InputOutputFileInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201InputOutputFileInd+targetIndex,targetLen);
    
   }
	char[] ip38201InputFile8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIp38201InputFile88()
	 *	@return  Returns true if isIp38201InputFile88() is "I"
	 */
   public boolean isIp38201InputFile88() throws CFException {
      return (  compareChars( getIp38201InputOutputFileInd() , ip38201InputFile8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIp38201InputFile88True() {  			
    	setIp38201InputOutputFileInd( ip38201InputFile8888Value);
   	}
	char[] ip38201OutputFile8888Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isIp38201OutputFile88()
	 *	@return  Returns true if isIp38201OutputFile88() is "O"
	 */
   public boolean isIp38201OutputFile88() throws CFException {
      return (  compareChars( getIp38201InputOutputFileInd() , ip38201OutputFile8888Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setIp38201OutputFile88True() {  			
    	setIp38201InputOutputFileInd( ip38201OutputFile8888Value);
   	}
	char[] ip38201ValidIOIndicator8888Value1 = "I".toCharArray();
char[] ip38201ValidIOIndicator8888Value2 = "O".toCharArray();

	/**
	 *	Test condition "I" "O" for isIp38201ValidIOIndicator88()
	 *	@return  Returns true if isIp38201ValidIOIndicator88() is "I" "O"
	 */
   public boolean isIp38201ValidIOIndicator88() throws CFException {
      return (  compareChars( getIp38201InputOutputFileInd() , ip38201ValidIOIndicator8888Value1)  == 0  ||  compareChars( getIp38201InputOutputFileInd() , ip38201ValidIOIndicator8888Value2)  == 0  );
   }


	/**
	*  set values "I" "O"
	*/
   	public void setIp38201ValidIOIndicator88True() {  			
    	setIp38201InputOutputFileInd( ip38201ValidIOIndicator8888Value1);
   	}
	/**
	 *	Returns the value of ip38201StorageMedia
	 *	@return ip38201StorageMedia
	 */
   public char[] getIp38201StorageMedia() throws CFException{
     if (isIp38201StorageMediaModified()) { 
        ip38201StorageMedia = refreshIp38201StorageMedia();
     }
   		return ip38201StorageMedia;
   }

  
	/**
	*  set variable ip38201StorageMedia
	*  Corresponding COBOL Variable is IP38201-STORAGE-MEDIA
	*  @param value
	**/
   public void setIp38201StorageMedia(char[] value) {
      ip38201StorageMedia = checkIp38201StorageMediaConstraints(value);
      serializeIp38201StorageMedia(ip38201StorageMedia);
   } 

     /**
	 * 	Update Ip38201StorageMedia 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201StorageMedia(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201StorageMedia,ip38201StorageMedia.length);
   	
   }
   
   public void setIp38201StorageMedia(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201StorageMedia,ip38201StorageMedia.length);
   	
   }
   
     /**
	 * 	Update Ip38201StorageMedia 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201StorageMedia(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201StorageMedia+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201StorageMedia with another Field
	 *	@param value
	 */
   public void setIp38201StorageMedia(Field source) {
       replace(source,0,source.length(),beginIp38201StorageMedia,IP_38201_STORAGE_MEDIA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201StorageMedia 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201StorageMedia(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201StorageMedia,IP_38201_STORAGE_MEDIA_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201StorageMedia 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201StorageMedia(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201StorageMedia+targetIndex,targetLen);
    
   }
	char[] ip38201Tape80Cartridge8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp38201Tape80Cartridge88()
	 *	@return  Returns true if isIp38201Tape80Cartridge88() is "C"
	 */
   public boolean isIp38201Tape80Cartridge88() throws CFException {
      return (  compareChars( getIp38201StorageMedia() , ip38201Tape80Cartridge8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp38201Tape80Cartridge88True() {  			
    	setIp38201StorageMedia( ip38201Tape80Cartridge8888Value);
   	}
	char[] ip38201TapeReel8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp38201TapeReel88()
	 *	@return  Returns true if isIp38201TapeReel88() is "R"
	 */
   public boolean isIp38201TapeReel88() throws CFException {
      return (  compareChars( getIp38201StorageMedia() , ip38201TapeReel8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp38201TapeReel88True() {  			
    	setIp38201StorageMedia( ip38201TapeReel8888Value);
   	}
	char[] ip38201Disk8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp38201Disk88()
	 *	@return  Returns true if isIp38201Disk88() is "D"
	 */
   public boolean isIp38201Disk88() throws CFException {
      return (  compareChars( getIp38201StorageMedia() , ip38201Disk8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp38201Disk88True() {  			
    	setIp38201StorageMedia( ip38201Disk8888Value);
   	}
	char[] ip38201DiskWorkPacks8888Value = "W".toCharArray();
	/**
	 *	Test condition "W" for isIp38201DiskWorkPacks88()
	 *	@return  Returns true if isIp38201DiskWorkPacks88() is "W"
	 */
   public boolean isIp38201DiskWorkPacks88() throws CFException {
      return (  compareChars( getIp38201StorageMedia() , ip38201DiskWorkPacks8888Value)  == 0  );
   }


	/**
	*  set values "W"
	*/
   	public void setIp38201DiskWorkPacks88True() {  			
    	setIp38201StorageMedia( ip38201DiskWorkPacks8888Value);
   	}
	char[] ip38201StorageMediaBlank8888Value = " ".toCharArray();
	/**
	 *	Test condition " " for isIp38201StorageMediaBlank88()
	 *	@return  Returns true if isIp38201StorageMediaBlank88() is " "
	 */
   public boolean isIp38201StorageMediaBlank88() throws CFException {
      return (  compareChars( getIp38201StorageMedia() , ip38201StorageMediaBlank8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIp38201StorageMediaBlank88True() {  			
    	setIp38201StorageMedia( ip38201StorageMediaBlank8888Value);
   	}
	char[] ip38201StorageMediaValid8888Value1 = "C".toCharArray();
char[] ip38201StorageMediaValid8888Value2 = "R".toCharArray();
char[] ip38201StorageMediaValid8888Value3 = "D".toCharArray();
char[] ip38201StorageMediaValid8888Value4 = "W".toCharArray();
char[] ip38201StorageMediaValid8888Value5 = " ".toCharArray();

	/**
	 *	Test condition "C" "R" "D" "W" " " for isIp38201StorageMediaValid88()
	 *	@return  Returns true if isIp38201StorageMediaValid88() is "C" "R" "D" "W" " "
	 */
   public boolean isIp38201StorageMediaValid88() throws CFException {
      return (  compareChars( getIp38201StorageMedia() , ip38201StorageMediaValid8888Value1)  == 0  ||  compareChars( getIp38201StorageMedia() , ip38201StorageMediaValid8888Value2)  == 0  ||  compareChars( getIp38201StorageMedia() , ip38201StorageMediaValid8888Value3)  == 0  ||  compareChars( getIp38201StorageMedia() , ip38201StorageMediaValid8888Value4)  == 0  ||  compareChars( getIp38201StorageMedia() , ip38201StorageMediaValid8888Value5)  == 0  );
   }


	/**
	*  set values "C" "R" "D" "W" " "
	*/
   	public void setIp38201StorageMediaValid88True() {  			
    	setIp38201StorageMedia( ip38201StorageMediaValid8888Value1);
   	}
	/**
	 *	Returns the value of ip38201TapeLabelType
	 *	@return ip38201TapeLabelType
	 */
   public char[] getIp38201TapeLabelType() throws CFException{
     if (isIp38201TapeLabelTypeModified()) { 
        ip38201TapeLabelType = refreshIp38201TapeLabelType();
     }
   		return ip38201TapeLabelType;
   }

  
	/**
	*  set variable ip38201TapeLabelType
	*  Corresponding COBOL Variable is IP38201-TAPE-LABEL-TYPE
	*  @param value
	**/
   public void setIp38201TapeLabelType(char[] value) {
      ip38201TapeLabelType = checkIp38201TapeLabelTypeConstraints(value);
      serializeIp38201TapeLabelType(ip38201TapeLabelType);
   } 

     /**
	 * 	Update Ip38201TapeLabelType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201TapeLabelType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201TapeLabelType,ip38201TapeLabelType.length);
   	
   }
   
   public void setIp38201TapeLabelType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201TapeLabelType,ip38201TapeLabelType.length);
   	
   }
   
     /**
	 * 	Update Ip38201TapeLabelType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201TapeLabelType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201TapeLabelType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201TapeLabelType with another Field
	 *	@param value
	 */
   public void setIp38201TapeLabelType(Field source) {
       replace(source,0,source.length(),beginIp38201TapeLabelType,IP_38201_TAPE_LABEL_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201TapeLabelType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201TapeLabelType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201TapeLabelType,IP_38201_TAPE_LABEL_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201TapeLabelType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201TapeLabelType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201TapeLabelType+targetIndex,targetLen);
    
   }
	static java.util.Set<String> ip38201ValidTapeLabel8888Value = new java.util.HashSet<>();
static { 
	ip38201ValidTapeLabel8888Value.add( "SL ");
	ip38201ValidTapeLabel8888Value.add( "BLP");
	ip38201ValidTapeLabel8888Value.add( "NL ");
	ip38201ValidTapeLabel8888Value.add( "NSL");
	ip38201ValidTapeLabel8888Value.add( "SUL");
	ip38201ValidTapeLabel8888Value.add( "LTM");
	ip38201ValidTapeLabel8888Value.add( "AL ");
	ip38201ValidTapeLabel8888Value.add( "AUL");
} 

	/**
	 *	Test condition "SL " "BLP" "NL " "NSL" "SUL" "LTM" "AL " "AUL" for isIp38201ValidTapeLabel88()
	 *	@return  Returns true if isIp38201ValidTapeLabel88() is "SL " "BLP" "NL " "NSL" "SUL" "LTM" "AL " "AUL"
	 */
   public boolean isIp38201ValidTapeLabel88() throws CFException {
      return   ip38201ValidTapeLabel8888Value.contains(String.valueOf(getIp38201TapeLabelType()));
   }


	/**
	*  set values "SL " "BLP" "NL " "NSL" "SUL" "LTM" "AL " "AUL"
	*/
   	public void setIp38201ValidTapeLabel88True() {  			
    	  setIp38201TapeLabelType(ip38201ValidTapeLabel8888Value.iterator().next().toCharArray());
   	}
	/**
	 *	Returns the value of ip38201TapeSequenceNumber
	 *	@return ip38201TapeSequenceNumber
	 */
	public long getIp38201TapeSequenceNumber() throws CFException {
       if (isIp38201TapeSequenceNumberModified()) { 
           ip38201TapeSequenceNumber = refreshIp38201TapeSequenceNumber();
        }
   		return ip38201TapeSequenceNumber;
	}
	

	
	   
	/**
	 * 	Update Ip38201TapeSequenceNumber with the passed value
	 *  Corresponding COBOL Variable is IP38201-TAPE-SEQUENCE-NUMBER
	 *	@param number
	 */
	public void setIp38201TapeSequenceNumber(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip38201TapeSequenceNumber = checkIp38201TapeSequenceNumberMaxLimit(number); 
		serializeIp38201TapeSequenceNumber(ip38201TapeSequenceNumber);
	}
	

	/**
	 * 	Update Ip38201TapeSequenceNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp38201TapeSequenceNumber(char[] value) throws CFException {
		 ip38201TapeSequenceNumber = serializeIp38201TapeSequenceNumber(value);
	}
	/**
	 * 	Update Ip38201TapeSequenceNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp38201TapeSequenceNumberString(char[] value) throws CFException {
		 setIp38201TapeSequenceNumber(value);
	}
	/**
	 *	Returns the value of ip38201DiskVolSer
	 *	@return ip38201DiskVolSer
	 */
   public char[] getIp38201DiskVolSer() throws CFException{
     if (isIp38201DiskVolSerModified()) { 
        ip38201DiskVolSer = refreshIp38201DiskVolSer();
     }
   		return ip38201DiskVolSer;
   }

  
	/**
	*  set variable ip38201DiskVolSer
	*  Corresponding COBOL Variable is IP38201-DISK-VOL-SER
	*  @param value
	**/
   public void setIp38201DiskVolSer(char[] value) {
      ip38201DiskVolSer = checkIp38201DiskVolSerConstraints(value);
      serializeIp38201DiskVolSer(ip38201DiskVolSer);
   } 

     /**
	 * 	Update Ip38201DiskVolSer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201DiskVolSer(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201DiskVolSer,ip38201DiskVolSer.length);
   	
   }
   
   public void setIp38201DiskVolSer(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DiskVolSer,ip38201DiskVolSer.length);
   	
   }
   
     /**
	 * 	Update Ip38201DiskVolSer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DiskVolSer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DiskVolSer+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201DiskVolSer with another Field
	 *	@param value
	 */
   public void setIp38201DiskVolSer(Field source) {
       replace(source,0,source.length(),beginIp38201DiskVolSer,IP_38201_DISK_VOL_SER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201DiskVolSer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201DiskVolSer(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201DiskVolSer,IP_38201_DISK_VOL_SER_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201DiskVolSer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DiskVolSer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DiskVolSer+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip38201SpaceParms
	 *	@return ip38201SpaceParms
	 */   
	 public Ip38201SpaceParms getIp38201SpaceParms() {
   	return ip38201SpaceParms;
   }
   /**
	* 	Update Ip38201SpaceParms with the passed value
	*   Corresponding COBOL Variable is IP38201-SPACE-PARMS
	*	@param value
	*/
   public void setIp38201SpaceParms(char[] value) {
      ip38201SpaceParms.setString(value); 
   }   
    
     /**
	 * 	Update Ip38201SpaceParms 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp38201SpaceParms(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip38201SpaceParms.begin,ip38201SpaceParms.length());
   }
   
     /**
	 * 	Update Ip38201SpaceParms 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201SpaceParms(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip38201SpaceParms.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip38201SpaceParms with another Field
	 *	@param value
	 */
   public void setIp38201SpaceParms(Field source) {
   	replace(source,0,source.length(),ip38201SpaceParms.begin,ip38201SpaceParms.length());
   }  
   
     /**
	 * 	Update Ip38201SpaceParms 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp38201SpaceParms(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip38201SpaceParms.begin,ip38201SpaceParms.length());
   }
   
     /**
	 * 	Update Ip38201SpaceParms 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201SpaceParms(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip38201SpaceParms.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip38201DcbInfo
	 *	@return ip38201DcbInfo
	 */   
	 public Ip38201DcbInfo getIp38201DcbInfo() {
   	return ip38201DcbInfo;
   }
   /**
	* 	Update Ip38201DcbInfo with the passed value
	*   Corresponding COBOL Variable is IP38201-DCB-INFO
	*	@param value
	*/
   public void setIp38201DcbInfo(char[] value) {
      ip38201DcbInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ip38201DcbInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp38201DcbInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip38201DcbInfo.begin,ip38201DcbInfo.length());
   }
   
     /**
	 * 	Update Ip38201DcbInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DcbInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip38201DcbInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip38201DcbInfo with another Field
	 *	@param value
	 */
   public void setIp38201DcbInfo(Field source) {
   	replace(source,0,source.length(),ip38201DcbInfo.begin,ip38201DcbInfo.length());
   }  
   
     /**
	 * 	Update Ip38201DcbInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp38201DcbInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip38201DcbInfo.begin,ip38201DcbInfo.length());
   }
   
     /**
	 * 	Update Ip38201DcbInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DcbInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip38201DcbInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip38201EnvironmentIndicator
	 *	@return ip38201EnvironmentIndicator
	 */
   public char[] getIp38201EnvironmentIndicator() throws CFException{
     if (isIp38201EnvironmentIndicatorModified()) { 
        ip38201EnvironmentIndicator = refreshIp38201EnvironmentIndicator();
     }
   		return ip38201EnvironmentIndicator;
   }

  
	/**
	*  set variable ip38201EnvironmentIndicator
	*  Corresponding COBOL Variable is IP38201-ENVIRONMENT-INDICATOR
	*  @param value
	**/
   public void setIp38201EnvironmentIndicator(char[] value) {
      ip38201EnvironmentIndicator = checkIp38201EnvironmentIndicatorConstraints(value);
      serializeIp38201EnvironmentIndicator(ip38201EnvironmentIndicator);
   } 

     /**
	 * 	Update Ip38201EnvironmentIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201EnvironmentIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201EnvironmentIndicator,ip38201EnvironmentIndicator.length);
   	
   }
   
   public void setIp38201EnvironmentIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201EnvironmentIndicator,ip38201EnvironmentIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip38201EnvironmentIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201EnvironmentIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201EnvironmentIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201EnvironmentIndicator with another Field
	 *	@param value
	 */
   public void setIp38201EnvironmentIndicator(Field source) {
       replace(source,0,source.length(),beginIp38201EnvironmentIndicator,IP_38201_ENVIRONMENT_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201EnvironmentIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201EnvironmentIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201EnvironmentIndicator,IP_38201_ENVIRONMENT_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201EnvironmentIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201EnvironmentIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201EnvironmentIndicator+targetIndex,targetLen);
    
   }
	char[] ip38201EnvrnmntIndTest8888Value = "TEST".toCharArray();
	/**
	 *	Test condition "TEST" for isIp38201EnvrnmntIndTest88()
	 *	@return  Returns true if isIp38201EnvrnmntIndTest88() is "TEST"
	 */
   public boolean isIp38201EnvrnmntIndTest88() throws CFException {
      return (  compareChars( getIp38201EnvironmentIndicator() , ip38201EnvrnmntIndTest8888Value)  == 0  );
   }


	/**
	*  set values "TEST"
	*/
   	public void setIp38201EnvrnmntIndTest88True() {  			
    	setIp38201EnvironmentIndicator( ip38201EnvrnmntIndTest8888Value);
   	}
	char[] ip38201EnvrnmntIndProd8888Value = "MCI ".toCharArray();
	/**
	 *	Test condition "MCI " for isIp38201EnvrnmntIndProd88()
	 *	@return  Returns true if isIp38201EnvrnmntIndProd88() is "MCI "
	 */
   public boolean isIp38201EnvrnmntIndProd88() throws CFException {
      return (  compareChars( getIp38201EnvironmentIndicator() , ip38201EnvrnmntIndProd8888Value)  == 0  );
   }


	/**
	*  set values "MCI "
	*/
   	public void setIp38201EnvrnmntIndProd88True() {  			
    	setIp38201EnvironmentIndicator( ip38201EnvrnmntIndProd8888Value);
   	}
	char[] ip38201EnvrnmntIndDtf8888Value = "DTF ".toCharArray();
	/**
	 *	Test condition "DTF " for isIp38201EnvrnmntIndDtf88()
	 *	@return  Returns true if isIp38201EnvrnmntIndDtf88() is "DTF "
	 */
   public boolean isIp38201EnvrnmntIndDtf88() throws CFException {
      return (  compareChars( getIp38201EnvironmentIndicator() , ip38201EnvrnmntIndDtf8888Value)  == 0  );
   }


	/**
	*  set values "DTF "
	*/
   	public void setIp38201EnvrnmntIndDtf88True() {  			
    	setIp38201EnvironmentIndicator( ip38201EnvrnmntIndDtf8888Value);
   	}
	char[] ip38201EnvrnmntIndItf8888Value = "ITF ".toCharArray();
	/**
	 *	Test condition "ITF " for isIp38201EnvrnmntIndItf88()
	 *	@return  Returns true if isIp38201EnvrnmntIndItf88() is "ITF "
	 */
   public boolean isIp38201EnvrnmntIndItf88() throws CFException {
      return (  compareChars( getIp38201EnvironmentIndicator() , ip38201EnvrnmntIndItf8888Value)  == 0  );
   }


	/**
	*  set values "ITF "
	*/
   	public void setIp38201EnvrnmntIndItf88True() {  			
    	setIp38201EnvironmentIndicator( ip38201EnvrnmntIndItf8888Value);
   	}
	char[] ip38201EnvrnmntIndYtf8888Value = "YTF ".toCharArray();
	/**
	 *	Test condition "YTF " for isIp38201EnvrnmntIndYtf88()
	 *	@return  Returns true if isIp38201EnvrnmntIndYtf88() is "YTF "
	 */
   public boolean isIp38201EnvrnmntIndYtf88() throws CFException {
      return (  compareChars( getIp38201EnvironmentIndicator() , ip38201EnvrnmntIndYtf8888Value)  == 0  );
   }


	/**
	*  set values "YTF "
	*/
   	public void setIp38201EnvrnmntIndYtf88True() {  			
    	setIp38201EnvironmentIndicator( ip38201EnvrnmntIndYtf8888Value);
   	}
	char[] ip38201EnvrnmntIndMtf8888Value = "MTF ".toCharArray();
	/**
	 *	Test condition "MTF " for isIp38201EnvrnmntIndMtf88()
	 *	@return  Returns true if isIp38201EnvrnmntIndMtf88() is "MTF "
	 */
   public boolean isIp38201EnvrnmntIndMtf88() throws CFException {
      return (  compareChars( getIp38201EnvironmentIndicator() , ip38201EnvrnmntIndMtf8888Value)  == 0  );
   }


	/**
	*  set values "MTF "
	*/
   	public void setIp38201EnvrnmntIndMtf88True() {  			
    	setIp38201EnvironmentIndicator( ip38201EnvrnmntIndMtf8888Value);
   	}
	char[] ip38201EnvrnmntIndZtf8888Value = "ZTF ".toCharArray();
	/**
	 *	Test condition "ZTF " for isIp38201EnvrnmntIndZtf88()
	 *	@return  Returns true if isIp38201EnvrnmntIndZtf88() is "ZTF "
	 */
   public boolean isIp38201EnvrnmntIndZtf88() throws CFException {
      return (  compareChars( getIp38201EnvironmentIndicator() , ip38201EnvrnmntIndZtf8888Value)  == 0  );
   }


	/**
	*  set values "ZTF "
	*/
   	public void setIp38201EnvrnmntIndZtf88True() {  			
    	setIp38201EnvironmentIndicator( ip38201EnvrnmntIndZtf8888Value);
   	}
	char[] ip38201EnvrnmntIndFtf8888Value = "FTF ".toCharArray();
	/**
	 *	Test condition "FTF " for isIp38201EnvrnmntIndFtf88()
	 *	@return  Returns true if isIp38201EnvrnmntIndFtf88() is "FTF "
	 */
   public boolean isIp38201EnvrnmntIndFtf88() throws CFException {
      return (  compareChars( getIp38201EnvironmentIndicator() , ip38201EnvrnmntIndFtf8888Value)  == 0  );
   }


	/**
	*  set values "FTF "
	*/
   	public void setIp38201EnvrnmntIndFtf88True() {  			
    	setIp38201EnvironmentIndicator( ip38201EnvrnmntIndFtf8888Value);
   	}
	static java.util.Set<String> ip38201EnvrnmntIndValid8888Value = new java.util.HashSet<>();
static { 
	ip38201EnvrnmntIndValid8888Value.add( "TEST");
	ip38201EnvrnmntIndValid8888Value.add( "MCI ");
	ip38201EnvrnmntIndValid8888Value.add( "DTF ");
	ip38201EnvrnmntIndValid8888Value.add( "ITF ");
	ip38201EnvrnmntIndValid8888Value.add( "MTF ");
	ip38201EnvrnmntIndValid8888Value.add( "ZTF ");
	ip38201EnvrnmntIndValid8888Value.add( "YTF ");
	ip38201EnvrnmntIndValid8888Value.add( "FTF ");
} 

	/**
	 *	Test condition "TEST" "MCI " "DTF " "ITF " "MTF " "ZTF " "YTF " "FTF " for isIp38201EnvrnmntIndValid88()
	 *	@return  Returns true if isIp38201EnvrnmntIndValid88() is "TEST" "MCI " "DTF " "ITF " "MTF " "ZTF " "YTF " "FTF "
	 */
   public boolean isIp38201EnvrnmntIndValid88() throws CFException {
      return   ip38201EnvrnmntIndValid8888Value.contains(String.valueOf(getIp38201EnvironmentIndicator()));
   }


	/**
	*  set values "TEST" "MCI " "DTF " "ITF " "MTF " "ZTF " "YTF " "FTF "
	*/
   	public void setIp38201EnvrnmntIndValid88True() {  			
    	  setIp38201EnvironmentIndicator(ip38201EnvrnmntIndValid8888Value.iterator().next().toCharArray());
   	}
	/**
	 *	Returns the value of ip38201BulkType
	 *	@return ip38201BulkType
	 */
   public char[] getIp38201BulkType() throws CFException{
     if (isIp38201BulkTypeModified()) { 
        ip38201BulkType = refreshIp38201BulkType();
     }
   		return ip38201BulkType;
   }

  
	/**
	*  set variable ip38201BulkType
	*  Corresponding COBOL Variable is IP38201-BULK-TYPE
	*  @param value
	**/
   public void setIp38201BulkType(char[] value) {
      ip38201BulkType = checkIp38201BulkTypeConstraints(value);
      serializeIp38201BulkType(ip38201BulkType);
   } 

     /**
	 * 	Update Ip38201BulkType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201BulkType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201BulkType,ip38201BulkType.length);
   	
   }
   
   public void setIp38201BulkType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201BulkType,ip38201BulkType.length);
   	
   }
   
     /**
	 * 	Update Ip38201BulkType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201BulkType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201BulkType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201BulkType with another Field
	 *	@param value
	 */
   public void setIp38201BulkType(Field source) {
       replace(source,0,source.length(),beginIp38201BulkType,IP_38201_BULK_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201BulkType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201BulkType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201BulkType,IP_38201_BULK_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201BulkType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201BulkType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201BulkType+targetIndex,targetLen);
    
   }
	char[] ip38201BulkTypeBlank8888Value = "    ".toCharArray();
	/**
	 *	Test condition " " for isIp38201BulkTypeBlank88()
	 *	@return  Returns true if isIp38201BulkTypeBlank88() is " "
	 */
   public boolean isIp38201BulkTypeBlank88() throws CFException {
      return (  compareChars( getIp38201BulkType() , ip38201BulkTypeBlank8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIp38201BulkTypeBlank88True() {  			
    	setIp38201BulkType( ip38201BulkTypeBlank8888Value);
   	}
	/**
	 *	Returns the value of ip38201ClearingIdentifier
	 *	@return ip38201ClearingIdentifier
	 */
   public char[] getIp38201ClearingIdentifier() throws CFException{
     if (isIp38201ClearingIdentifierModified()) { 
        ip38201ClearingIdentifier = refreshIp38201ClearingIdentifier();
     }
   		return ip38201ClearingIdentifier;
   }

  
	/**
	*  set variable ip38201ClearingIdentifier
	*  Corresponding COBOL Variable is IP38201-CLEARING-IDENTIFIER
	*  @param value
	**/
   public void setIp38201ClearingIdentifier(char[] value) {
      ip38201ClearingIdentifier = checkIp38201ClearingIdentifierConstraints(value);
      serializeIp38201ClearingIdentifier(ip38201ClearingIdentifier);
   } 

     /**
	 * 	Update Ip38201ClearingIdentifier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201ClearingIdentifier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201ClearingIdentifier,ip38201ClearingIdentifier.length);
   	
   }
   
   public void setIp38201ClearingIdentifier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201ClearingIdentifier,ip38201ClearingIdentifier.length);
   	
   }
   
     /**
	 * 	Update Ip38201ClearingIdentifier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201ClearingIdentifier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201ClearingIdentifier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201ClearingIdentifier with another Field
	 *	@param value
	 */
   public void setIp38201ClearingIdentifier(Field source) {
       replace(source,0,source.length(),beginIp38201ClearingIdentifier,IP_38201_CLEARING_IDENTIFIER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201ClearingIdentifier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201ClearingIdentifier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201ClearingIdentifier,IP_38201_CLEARING_IDENTIFIER_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201ClearingIdentifier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201ClearingIdentifier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201ClearingIdentifier+targetIndex,targetLen);
    
   }
	char[] ip38201ClearingIdBlank8888Value = "     ".toCharArray();
	/**
	 *	Test condition " " for isIp38201ClearingIdBlank88()
	 *	@return  Returns true if isIp38201ClearingIdBlank88() is " "
	 */
   public boolean isIp38201ClearingIdBlank88() throws CFException {
      return (  compareChars( getIp38201ClearingIdentifier() , ip38201ClearingIdBlank8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIp38201ClearingIdBlank88True() {  			
    	setIp38201ClearingIdentifier( ip38201ClearingIdBlank8888Value);
   	}
	/**
	 *	Returns the value of ip38201DsnThirdQualifier
	 *	@return ip38201DsnThirdQualifier
	 */
   public char[] getIp38201DsnThirdQualifier() throws CFException{
     if (isIp38201DsnThirdQualifierModified()) { 
        ip38201DsnThirdQualifier = refreshIp38201DsnThirdQualifier();
     }
   		return ip38201DsnThirdQualifier;
   }

  
	/**
	*  set variable ip38201DsnThirdQualifier
	*  Corresponding COBOL Variable is IP38201-DSN-THIRD-QUALIFIER
	*  @param value
	**/
   public void setIp38201DsnThirdQualifier(char[] value) {
      ip38201DsnThirdQualifier = checkIp38201DsnThirdQualifierConstraints(value);
      serializeIp38201DsnThirdQualifier(ip38201DsnThirdQualifier);
   } 

     /**
	 * 	Update Ip38201DsnThirdQualifier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201DsnThirdQualifier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201DsnThirdQualifier,ip38201DsnThirdQualifier.length);
   	
   }
   
   public void setIp38201DsnThirdQualifier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DsnThirdQualifier,ip38201DsnThirdQualifier.length);
   	
   }
   
     /**
	 * 	Update Ip38201DsnThirdQualifier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DsnThirdQualifier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DsnThirdQualifier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201DsnThirdQualifier with another Field
	 *	@param value
	 */
   public void setIp38201DsnThirdQualifier(Field source) {
       replace(source,0,source.length(),beginIp38201DsnThirdQualifier,IP_38201_DSN_THIRD_QUALIFIER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201DsnThirdQualifier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201DsnThirdQualifier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201DsnThirdQualifier,IP_38201_DSN_THIRD_QUALIFIER_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201DsnThirdQualifier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DsnThirdQualifier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DsnThirdQualifier+targetIndex,targetLen);
    
   }
	char[] ip38201DsnThrdQualBlank8888Value = "    ".toCharArray();
	/**
	 *	Test condition " " for isIp38201DsnThrdQualBlank88()
	 *	@return  Returns true if isIp38201DsnThrdQualBlank88() is " "
	 */
   public boolean isIp38201DsnThrdQualBlank88() throws CFException {
      return (  compareChars( getIp38201DsnThirdQualifier() , ip38201DsnThrdQualBlank8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIp38201DsnThrdQualBlank88True() {  			
    	setIp38201DsnThirdQualifier( ip38201DsnThrdQualBlank8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip38201AllocateParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp38201InputOutputFileInd(CONSTANTS.SPACE);
         setIp38201StorageMedia(CONSTANTS.SPACE);
         setIp38201TapeLabelType(CONSTANTS.SPACE_3);
                     setIp38201TapeSequenceNumber(0);
          ip38201SpaceParms.initialize();
     
          ip38201DcbInfo.initialize();
     
         setIp38201EnvironmentIndicator(CONSTANTS.SPACE_4);
         setIp38201BulkType(CONSTANTS.SPACE_4);
         setIp38201ClearingIdentifier(CONSTANTS.SPACE_5);
         setIp38201DsnThirdQualifier(CONSTANTS.SPACE_4);
   }

		public static int getIp38201AllocateParmsFieldLength() {
			return IP_38201_ALLOCATE_PARMS_LENGTH;
		}

}
  
