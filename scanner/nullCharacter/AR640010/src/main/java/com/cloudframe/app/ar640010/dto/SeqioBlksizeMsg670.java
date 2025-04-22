package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioBlksizeMsg670 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class SeqioBlksizeMsg670 extends SeqioBlksizeMsg670Serialized {
   


								private long seqioBlksizeValue670;
	
	/**
	* Constructor for SeqioBlksizeMsg670
	**/
    public SeqioBlksizeMsg670() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("7002-MCISEQIO-BLKSIZE     : ").toCharArray()
             , getStartOffset() + 0
             ,28
             );
								setSeqioBlksizeValue670(0L);
    }


 

	/**
	 *	Returns the value of seqioBlksizeValue670
	 *	@return seqioBlksizeValue670
	 */
	public long getSeqioBlksizeValue670() throws CFException {
       if (isSeqioBlksizeValue670Modified()) { 
           seqioBlksizeValue670 = refreshSeqioBlksizeValue670();
        }
   		return seqioBlksizeValue670;
	}
	

	
	   
	/**
	 * 	Update SeqioBlksizeValue670 with the passed value
	 *  Corresponding COBOL Variable is 670-SEQIO-BLKSIZE-VALUE
	 *	@param number
	 */
	public void setSeqioBlksizeValue670(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    seqioBlksizeValue670 = checkSeqioBlksizeValue670MaxLimit(number); 
		serializeSeqioBlksizeValue670(seqioBlksizeValue670);
	}
	

	/**
	 * 	Update SeqioBlksizeValue670 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSeqioBlksizeValue670(char[] value) throws CFException {
		 seqioBlksizeValue670 = serializeSeqioBlksizeValue670(value);
	}
	/**
	 * 	Update SeqioBlksizeValue670 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSeqioBlksizeValue670String(char[] value) throws CFException {
		 setSeqioBlksizeValue670(value);
	}

	
	
	

		public static int getSeqioBlksizeMsg670FieldLength() {
			return SEQIO_BLKSIZE_MSG_670_LENGTH;
		}

}
  
