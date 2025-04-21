package com.cloudframe.app.global.sharedvar;

/**
*  The class MiscData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_miscData")

public class MiscData extends MiscDataSerialized  implements InitializingBean {
   

								private int xmlStat;

								private long recLenIn;

								private short eofFlag;
	
	/**
	* Constructor for MiscData
	**/
    public MiscData() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of xmlStat
	 *	@return xmlStat
	 */
	public int getXmlStat() throws CFException {
       if (isXmlStatModified()) { 
           xmlStat = refreshXmlStat();
        }
   		return xmlStat;
	}
	

	
	   
	/**
	 * 	Update XmlStat with the passed value
	 *  Corresponding COBOL Variable is XML-STAT
	 *	@param number
	 */
	public void setXmlStat(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    xmlStat = checkXmlStatMaxLimit(number); 
		serializeXmlStat(xmlStat);
	}
	

	public void setXmlStat(long number) {
	    number = checkXmlStatMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXmlStat((int)number);
	}
	
	/**
	 * 	Update XmlStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setXmlStat(char[] value) throws CFException {
		 xmlStat = serializeXmlStat(value);
	}
	/**
	 * 	Update XmlStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXmlStatString(char[] value) throws CFException {
		 setXmlStat(value);
	}
	/**
	 *	Returns the value of recLenIn
	 *	@return recLenIn
	 */
	public long getRecLenIn() throws CFException {
        if (isRecLenInModified()) { 
           recLenIn = refreshRecLenIn();
        }
   		return recLenIn;
	}
	
	/**
	 * 	Update RecLenIn with the passed value
	 *  Corresponding COBOL Variable is WS-REC-LEN-IN
	 *	@param number
	 */
	public void setRecLenIn(long number) {
	     // Truncate if the number is beyond +/- Max range
	    recLenIn = checkRecLenInMaxLimit(number); 
		serializeRecLenIn(recLenIn);
	}


	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
	public short getEofFlag() throws CFException {
        if (isEofFlagModified()) { 
           eofFlag = refreshEofFlag();
        }
   		return eofFlag;
	}
	
	/**
	 * 	Update EofFlag with the passed value
	 *  Corresponding COBOL Variable is WS-EOF-FLAG
	 *	@param number
	 */
	public void setEofFlag(short number) {
	     // Truncate if the number is beyond +/- Max range
	    eofFlag = checkEofFlagMaxLimit(number); 
		serializeEofFlag(eofFlag);
	}

	public void setEofFlag(int number) {
	    number = checkEofFlagMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEofFlag((short)number);
	}
	public void setEofFlag(long number) {
	    number = checkEofFlagMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEofFlag((short)number);
	}
	

	
	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return (  getEofFlag()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue() {  			
    	setEofFlag( (short)1);
   	}

	
	
	
	/**
	 * 	initializes MiscData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setXmlStat(0);
                     setRecLenIn(0);
         	setEofFlag((short)0);
   }

		public static int getMiscDataFieldLength() {
			return MISC_DATA_LENGTH;
		}

}
  
