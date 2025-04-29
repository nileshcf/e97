package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip38201DcbInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip38201DcbInfo extends Ip38201DcbInfoSerialized { 
   

						private char[] ip38201Recfm = Field.fillLowValue(3);

								private long ip38201Lrecl;

								private long ip38201Blksize;

								private long ip38201Bufno;

								private long ip38201AverageLrecl;

								private long ip38201RecordCount;

								private long ip38201BlockLength;
	
	/**
	* Constructor for Ip38201DcbInfo
	**/
    public Ip38201DcbInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip38201DcbInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201DcbInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip38201Recfm
	 *	@return ip38201Recfm
	 */
   public char[] getIp38201Recfm() throws CFException{
     if (isIp38201RecfmModified()) { 
        ip38201Recfm = refreshIp38201Recfm();
     }
   		return ip38201Recfm;
   }

  
	/**
	*  set variable ip38201Recfm
	*  Corresponding COBOL Variable is IP38201-RECFM
	*  @param value
	**/
   public void setIp38201Recfm(char[] value) {
      ip38201Recfm = checkIp38201RecfmConstraints(value);
      serializeIp38201Recfm(ip38201Recfm);
   } 

     /**
	 * 	Update Ip38201Recfm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201Recfm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201Recfm,ip38201Recfm.length);
   	
   }
   
   public void setIp38201Recfm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Recfm,ip38201Recfm.length);
   	
   }
   
     /**
	 * 	Update Ip38201Recfm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Recfm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Recfm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201Recfm with another Field
	 *	@param value
	 */
   public void setIp38201Recfm(Field source) {
       replace(source,0,source.length(),beginIp38201Recfm,IP_38201_RECFM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201Recfm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201Recfm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201Recfm,IP_38201_RECFM_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201Recfm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Recfm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Recfm+targetIndex,targetLen);
    
   }
	char[] ip38201RecfmFixedLength8888Value = "F  ".toCharArray();
	/**
	 *	Test condition "F  " for isIp38201RecfmFixedLength88()
	 *	@return  Returns true if isIp38201RecfmFixedLength88() is "F  "
	 */
   public boolean isIp38201RecfmFixedLength88() throws CFException {
      return (  compareChars( getIp38201Recfm() , ip38201RecfmFixedLength8888Value)  == 0  );
   }


	/**
	*  set values "F  "
	*/
   	public void setIp38201RecfmFixedLength88True() {  			
    	setIp38201Recfm( ip38201RecfmFixedLength8888Value);
   	}
	char[] ip38201RecfmFixedBlocked8888Value = "FB ".toCharArray();
	/**
	 *	Test condition "FB " for isIp38201RecfmFixedBlocked88()
	 *	@return  Returns true if isIp38201RecfmFixedBlocked88() is "FB "
	 */
   public boolean isIp38201RecfmFixedBlocked88() throws CFException {
      return (  compareChars( getIp38201Recfm() , ip38201RecfmFixedBlocked8888Value)  == 0  );
   }


	/**
	*  set values "FB "
	*/
   	public void setIp38201RecfmFixedBlocked88True() {  			
    	setIp38201Recfm( ip38201RecfmFixedBlocked8888Value);
   	}
	char[] ip38201RecfmVariableLnth8888Value = "V  ".toCharArray();
	/**
	 *	Test condition "V  " for isIp38201RecfmVariableLnth88()
	 *	@return  Returns true if isIp38201RecfmVariableLnth88() is "V  "
	 */
   public boolean isIp38201RecfmVariableLnth88() throws CFException {
      return (  compareChars( getIp38201Recfm() , ip38201RecfmVariableLnth8888Value)  == 0  );
   }


	/**
	*  set values "V  "
	*/
   	public void setIp38201RecfmVariableLnth88True() {  			
    	setIp38201Recfm( ip38201RecfmVariableLnth8888Value);
   	}
	char[] ip38201RecfmVarBlocked8888Value = "VB ".toCharArray();
	/**
	 *	Test condition "VB " for isIp38201RecfmVarBlocked88()
	 *	@return  Returns true if isIp38201RecfmVarBlocked88() is "VB "
	 */
   public boolean isIp38201RecfmVarBlocked88() throws CFException {
      return (  compareChars( getIp38201Recfm() , ip38201RecfmVarBlocked8888Value)  == 0  );
   }


	/**
	*  set values "VB "
	*/
   	public void setIp38201RecfmVarBlocked88True() {  			
    	setIp38201Recfm( ip38201RecfmVarBlocked8888Value);
   	}
	char[] ip38201RecfmVarSpanned8888Value = "VS ".toCharArray();
	/**
	 *	Test condition "VS " for isIp38201RecfmVarSpanned88()
	 *	@return  Returns true if isIp38201RecfmVarSpanned88() is "VS "
	 */
   public boolean isIp38201RecfmVarSpanned88() throws CFException {
      return (  compareChars( getIp38201Recfm() , ip38201RecfmVarSpanned8888Value)  == 0  );
   }


	/**
	*  set values "VS "
	*/
   	public void setIp38201RecfmVarSpanned88True() {  			
    	setIp38201Recfm( ip38201RecfmVarSpanned8888Value);
   	}
	char[] ip38201RecfmVSBlocked8888Value = "VBS".toCharArray();
	/**
	 *	Test condition "VBS" for isIp38201RecfmVSBlocked88()
	 *	@return  Returns true if isIp38201RecfmVSBlocked88() is "VBS"
	 */
   public boolean isIp38201RecfmVSBlocked88() throws CFException {
      return (  compareChars( getIp38201Recfm() , ip38201RecfmVSBlocked8888Value)  == 0  );
   }


	/**
	*  set values "VBS"
	*/
   	public void setIp38201RecfmVSBlocked88True() {  			
    	setIp38201Recfm( ip38201RecfmVSBlocked8888Value);
   	}
	char[] ip38201RecfmUndefined8888Value = "U  ".toCharArray();
	/**
	 *	Test condition "U  " for isIp38201RecfmUndefined88()
	 *	@return  Returns true if isIp38201RecfmUndefined88() is "U  "
	 */
   public boolean isIp38201RecfmUndefined88() throws CFException {
      return (  compareChars( getIp38201Recfm() , ip38201RecfmUndefined8888Value)  == 0  );
   }


	/**
	*  set values "U  "
	*/
   	public void setIp38201RecfmUndefined88True() {  			
    	setIp38201Recfm( ip38201RecfmUndefined8888Value);
   	}
	static java.util.Set<String> ip38201RecfmValid8888Value = new java.util.HashSet<>();
static { 
	ip38201RecfmValid8888Value.add( "F  ");
	ip38201RecfmValid8888Value.add( "FB ");
	ip38201RecfmValid8888Value.add( "V  ");
	ip38201RecfmValid8888Value.add( "VS ");
	ip38201RecfmValid8888Value.add( "VB ");
	ip38201RecfmValid8888Value.add( "VBS");
	ip38201RecfmValid8888Value.add( "U  ");
} 

	/**
	 *	Test condition "F  " "FB " "V  " "VS " "VB " "VBS" "U  " for isIp38201RecfmValid88()
	 *	@return  Returns true if isIp38201RecfmValid88() is "F  " "FB " "V  " "VS " "VB " "VBS" "U  "
	 */
   public boolean isIp38201RecfmValid88() throws CFException {
      return   ip38201RecfmValid8888Value.contains(String.valueOf(getIp38201Recfm()));
   }


	/**
	*  set values "F  " "FB " "V  " "VS " "VB " "VBS" "U  "
	*/
   	public void setIp38201RecfmValid88True() {  			
    	  setIp38201Recfm(ip38201RecfmValid8888Value.iterator().next().toCharArray());
   	}
	/**
	 *	Returns the value of ip38201Lrecl
	 *	@return ip38201Lrecl
	 */
	public long getIp38201Lrecl() throws CFException {
       if (isIp38201LreclModified()) { 
           ip38201Lrecl = refreshIp38201Lrecl();
        }
   		return ip38201Lrecl;
	}
	

	
	   
	/**
	 * 	Update Ip38201Lrecl with the passed value
	 *  Corresponding COBOL Variable is IP38201-LRECL
	 *	@param number
	 */
	public void setIp38201Lrecl(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip38201Lrecl = checkIp38201LreclMaxLimit(number); 
		serializeIp38201Lrecl(ip38201Lrecl);
	}
	

	/**
	 * 	Update Ip38201Lrecl with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp38201Lrecl(char[] value) throws CFException {
		 ip38201Lrecl = serializeIp38201Lrecl(value);
	}
	/**
	 * 	Update Ip38201Lrecl with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp38201LreclString(char[] value) throws CFException {
		 setIp38201Lrecl(value);
	}
	/**
	 *	Returns the value of ip38201Blksize
	 *	@return ip38201Blksize
	 */
	public long getIp38201Blksize() throws CFException {
       if (isIp38201BlksizeModified()) { 
           ip38201Blksize = refreshIp38201Blksize();
        }
   		return ip38201Blksize;
	}
	

	
	   
	/**
	 * 	Update Ip38201Blksize with the passed value
	 *  Corresponding COBOL Variable is IP38201-BLKSIZE
	 *	@param number
	 */
	public void setIp38201Blksize(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip38201Blksize = checkIp38201BlksizeMaxLimit(number); 
		serializeIp38201Blksize(ip38201Blksize);
	}
	

	/**
	 * 	Update Ip38201Blksize with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp38201Blksize(char[] value) throws CFException {
		 ip38201Blksize = serializeIp38201Blksize(value);
	}
	/**
	 * 	Update Ip38201Blksize with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp38201BlksizeString(char[] value) throws CFException {
		 setIp38201Blksize(value);
	}
	/**
	 *	Returns the value of ip38201Bufno
	 *	@return ip38201Bufno
	 */
	public long getIp38201Bufno() throws CFException {
       if (isIp38201BufnoModified()) { 
           ip38201Bufno = refreshIp38201Bufno();
        }
   		return ip38201Bufno;
	}
	

	
	   
	/**
	 * 	Update Ip38201Bufno with the passed value
	 *  Corresponding COBOL Variable is IP38201-BUFNO
	 *	@param number
	 */
	public void setIp38201Bufno(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip38201Bufno = checkIp38201BufnoMaxLimit(number); 
		serializeIp38201Bufno(ip38201Bufno);
	}
	

	/**
	 * 	Update Ip38201Bufno with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp38201Bufno(char[] value) throws CFException {
		 ip38201Bufno = serializeIp38201Bufno(value);
	}
	/**
	 * 	Update Ip38201Bufno with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp38201BufnoString(char[] value) throws CFException {
		 setIp38201Bufno(value);
	}
	/**
	 *	Returns the value of ip38201AverageLrecl
	 *	@return ip38201AverageLrecl
	 */
	public long getIp38201AverageLrecl() throws CFException {
       if (isIp38201AverageLreclModified()) { 
           ip38201AverageLrecl = refreshIp38201AverageLrecl();
        }
   		return ip38201AverageLrecl;
	}
	

	
	   
	/**
	 * 	Update Ip38201AverageLrecl with the passed value
	 *  Corresponding COBOL Variable is IP38201-AVERAGE-LRECL
	 *	@param number
	 */
	public void setIp38201AverageLrecl(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip38201AverageLrecl = checkIp38201AverageLreclMaxLimit(number); 
		serializeIp38201AverageLrecl(ip38201AverageLrecl);
	}
	

	/**
	 * 	Update Ip38201AverageLrecl with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp38201AverageLrecl(char[] value) throws CFException {
		 ip38201AverageLrecl = serializeIp38201AverageLrecl(value);
	}
	/**
	 * 	Update Ip38201AverageLrecl with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp38201AverageLreclString(char[] value) throws CFException {
		 setIp38201AverageLrecl(value);
	}
	/**
	 *	Returns the value of ip38201RecordCount
	 *	@return ip38201RecordCount
	 */
	public long getIp38201RecordCount() throws CFException {
       if (isIp38201RecordCountModified()) { 
           ip38201RecordCount = refreshIp38201RecordCount();
        }
   		return ip38201RecordCount;
	}
	

	
	   
	/**
	 * 	Update Ip38201RecordCount with the passed value
	 *  Corresponding COBOL Variable is IP38201-RECORD-COUNT
	 *	@param number
	 */
	public void setIp38201RecordCount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip38201RecordCount = checkIp38201RecordCountMaxLimit(number); 
		serializeIp38201RecordCount(ip38201RecordCount);
	}
	

	/**
	 * 	Update Ip38201RecordCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp38201RecordCount(char[] value) throws CFException {
		 ip38201RecordCount = serializeIp38201RecordCount(value);
	}
	/**
	 * 	Update Ip38201RecordCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp38201RecordCountString(char[] value) throws CFException {
		 setIp38201RecordCount(value);
	}
	/**
	 *	Returns the value of ip38201BlockLength
	 *	@return ip38201BlockLength
	 */
	public long getIp38201BlockLength() throws CFException {
       if (isIp38201BlockLengthModified()) { 
           ip38201BlockLength = refreshIp38201BlockLength();
        }
   		return ip38201BlockLength;
	}
	

	
	   
	/**
	 * 	Update Ip38201BlockLength with the passed value
	 *  Corresponding COBOL Variable is IP38201-BLOCK-LENGTH
	 *	@param number
	 */
	public void setIp38201BlockLength(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip38201BlockLength = checkIp38201BlockLengthMaxLimit(number); 
		serializeIp38201BlockLength(ip38201BlockLength);
	}
	

	/**
	 * 	Update Ip38201BlockLength with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp38201BlockLength(char[] value) throws CFException {
		 ip38201BlockLength = serializeIp38201BlockLength(value);
	}
	/**
	 * 	Update Ip38201BlockLength with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp38201BlockLengthString(char[] value) throws CFException {
		 setIp38201BlockLength(value);
	}

	
	
	
	/**
	 * 	initializes Ip38201DcbInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp38201Recfm(CONSTANTS.SPACE_3);
                     setIp38201Lrecl(0);
                     setIp38201Blksize(0);
                     setIp38201Bufno(0);
                     setIp38201AverageLrecl(0);
                     setIp38201RecordCount(0);
                     setIp38201BlockLength(0);
   }

		public static int getIp38201DcbInfoFieldLength() {
			return IP_38201_DCB_INFO_LENGTH;
		}

}
  
