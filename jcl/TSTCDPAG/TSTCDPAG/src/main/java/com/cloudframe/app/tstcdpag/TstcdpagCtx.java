package com.cloudframe.app.tstcdpag;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.tstcdpag.dto.Out;
import com.cloudframe.app.tstcdpag.file.records.InputRec;
import com.cloudframe.app.tstcdpag.file.records.OutputRec;
import com.cloudframe.app.tstcdpag.dto.Work;
import com.cloudframe.app.tstcdpag.dto.MiscData;


@Context
public class TstcdpagCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    InputRec inputRec;
    Work work;
    MiscData miscData;
    OutputRec outputRec;
    Out out;


    private int rc;

    public GlobalExecutorCtx getGlobalCtx() {
            return globalCtx;
    }

    public void setGlobalCtx(GlobalExecutorCtx globalCtx) {
        this.globalCtx = globalCtx;
    }

    public int getRc() {
        return this.rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }



    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public InputRec getInputRec() {
        if (inputRec == null) {
            inputRec = new InputRec();
        }

        return inputRec;
    }

    public void setInputRec(InputRec inputRec) {
        this.inputRec = inputRec;
    }
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public MiscData getMiscData() {
        if (miscData == null) {
            miscData = new MiscData();
        }

        return miscData;
    }

    public void setMiscData(MiscData miscData) {
        this.miscData = miscData;
    }
    public OutputRec getOutputRec() {
        if (outputRec == null) {
            outputRec = new OutputRec();
        }

        return outputRec;
    }

    public void setOutputRec(OutputRec outputRec) {
        this.outputRec = outputRec;
    }
    public Out getOut() {
        if (out == null) {
            out = new Out();
        }

        return out;
    }

    public void setOut(Out out) {
        this.out = out;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inputRec.hashCode();
        str += work.hashCode();
        str += miscData.hashCode();
        str += outputRec.hashCode();
        str += out.hashCode();
       return str.hashCode();
    }

    public TstcdpagCtx clone() {
        TstcdpagCtx cloneObj = new TstcdpagCtx();
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.out = new Out();
        cloneObj.out.set(out.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     InputRec inputRec = TstcdpagCtx.this.getInputRec();
     OutputRec outputRec = TstcdpagCtx.this.getOutputRec();
     MiscData miscData = TstcdpagCtx.this.getMiscData();

	/**
	 *	Returns the value of outputRec
	 *	@return outputRec
	 */   
	 public OutputRec getOutputRec() {
   	return outputRec;
   }


	/**
	 *	Returns the value of inputStatus
	 *	@return inputStatus
	 */
	public int getInputStatus() throws CFException {
   		return miscData.getInputStatus();
	}


	/**
	 *	Returns String value of inputStatus
	 *	@return inputStatus
	 */
	public char[]  getInputStatusString() throws CFException {
	     return String.valueOf(miscData.getInputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputStatusIsNumeric()  throws CFException{
	    return miscData.inputStatusIsNumeric();
	}

	/**
	 * 	Update InputStatus with the passed value
	 *	@param number
	 */
	public void setInputStatus(int number)  throws CFException{
		miscData.setInputStatus(number);
	}
	

	public void setInputStatus(long number)  throws CFException{
	    miscData.setInputStatus(number);
	}
	
	
	/**
	 * 	Update InputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputStatus(char[] value)  throws CFException {
		miscData.setInputStatus(value);
	}
	
	/**
	 * 	Update InputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInputStatusString(char[] value)  throws CFException{
		miscData.setInputStatus(value);
	}	

	/**
	 *	Returns the value of outputStatus
	 *	@return outputStatus
	 */
	public int getOutputStatus() throws CFException {
   		return miscData.getOutputStatus();
	}


	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() throws CFException {
	     return String.valueOf(miscData.getOutputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric()  throws CFException{
	    return miscData.outputStatusIsNumeric();
	}

	/**
	 * 	Update OutputStatus with the passed value
	 *	@param number
	 */
	public void setOutputStatus(int number)  throws CFException{
		miscData.setOutputStatus(number);
	}
	

	public void setOutputStatus(long number)  throws CFException{
	    miscData.setOutputStatus(number);
	}
	
	
	/**
	 * 	Update OutputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutputStatus(char[] value)  throws CFException {
		miscData.setOutputStatus(value);
	}
	
	/**
	 * 	Update OutputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutputStatusString(char[] value)  throws CFException{
		miscData.setOutputStatus(value);
	}	


        public TstcdpagCtx getTstcdpagCtx() {
            return TstcdpagCtx.this;
        }

        public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inputRec.hashCode();
        str += outputRec.hashCode();
        str += miscData.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     InputRec inputRec = TstcdpagCtx.this.getInputRec();
     MiscData miscData = TstcdpagCtx.this.getMiscData();
     OutputRec outputRec = TstcdpagCtx.this.getOutputRec();

	/**
	 *	Returns the value of inputRec
	 *	@return inputRec
	 */   
	 public InputRec getInputRec() {
   	return inputRec;
   }


	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
	public short getEofFlag() throws CFException {        
   		return miscData.getEofFlag();
	}
	
	/**
	 * 	Update EofFlag with the passed value
	 *	@param number
	 */
	public void setEofFlag(short number)  throws CFException{
		miscData.setEofFlag(number);
	}

	public void setEofFlag(int number)  throws CFException{
		miscData.setEofFlag((short)number);
	}

	public void setEofFlag(long number)  throws CFException{
		miscData.setEofFlag((short)number);
	}



	/**
	 *	Returns the value of miscData
	 *	@return miscData
	 */   
	 public MiscData getMiscData() {
   	return miscData;
   }


	/**
	 *	Returns the value of inputStatus
	 *	@return inputStatus
	 */
	public int getInputStatus() throws CFException {
   		return miscData.getInputStatus();
	}


	/**
	 *	Returns String value of inputStatus
	 *	@return inputStatus
	 */
	public char[]  getInputStatusString() throws CFException {
	     return String.valueOf(miscData.getInputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputStatusIsNumeric()  throws CFException{
	    return miscData.inputStatusIsNumeric();
	}

	/**
	 * 	Update InputStatus with the passed value
	 *	@param number
	 */
	public void setInputStatus(int number)  throws CFException{
		miscData.setInputStatus(number);
	}
	

	public void setInputStatus(long number)  throws CFException{
	    miscData.setInputStatus(number);
	}
	
	
	/**
	 * 	Update InputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputStatus(char[] value)  throws CFException {
		miscData.setInputStatus(value);
	}
	
	/**
	 * 	Update InputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInputStatusString(char[] value)  throws CFException{
		miscData.setInputStatus(value);
	}	

	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return miscData.isNoMoreRecords();
   }

	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue()  throws CFException{  			
    	miscData.setNoMoreRecordsTrue();
   	}
	/**
	 *	Returns the value of outputStatus
	 *	@return outputStatus
	 */
	public int getOutputStatus() throws CFException {
   		return miscData.getOutputStatus();
	}


	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() throws CFException {
	     return String.valueOf(miscData.getOutputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric()  throws CFException{
	    return miscData.outputStatusIsNumeric();
	}

	/**
	 * 	Update OutputStatus with the passed value
	 *	@param number
	 */
	public void setOutputStatus(int number)  throws CFException{
		miscData.setOutputStatus(number);
	}
	

	public void setOutputStatus(long number)  throws CFException{
	    miscData.setOutputStatus(number);
	}
	
	
	/**
	 * 	Update OutputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutputStatus(char[] value)  throws CFException {
		miscData.setOutputStatus(value);
	}
	
	/**
	 * 	Update OutputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutputStatusString(char[] value)  throws CFException{
		miscData.setOutputStatus(value);
	}	


        public TstcdpagCtx getTstcdpagCtx() {
            return TstcdpagCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inputRec.hashCode();
        str += miscData.hashCode();
        str += outputRec.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class ProcessOutputInCtx implements Cloneable {
     InputRec inputRec = TstcdpagCtx.this.getInputRec();
     OutputRec outputRec = TstcdpagCtx.this.getOutputRec();
     MiscData miscData = TstcdpagCtx.this.getMiscData();
     Out out = TstcdpagCtx.this.getOut();

	/**
	 *	Returns the value of outputRec
	 *	@return outputRec
	 */   
	 public OutputRec getOutputRec() {
   	return outputRec;
   }


	/**
	 *	Returns the value of inputByte
	 *	@return inputByte
	 */
   public char[] getInputByte() throws CFException  {              
   		return inputRec.getInputByte();
   }

  
	/**
	*  set variable inputByte
	*  @param value
	**/
   public void setInputByte(char[] value) throws CFException {
      inputRec.setInputByte(value);
   } 

     /**
	 * 	Update InputByte 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputByte(char[] source, int sourceIndex) throws CFException {
      inputRec.setInputByte(source, sourceIndex);
   	
   }
   
   public void setInputByte(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      inputRec.setInputByte(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InputByte 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputByte(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputRec.setInputByte(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InputByte with another Field
	 *	@param value
	 */
   public void setInputByte(Field source) {
      inputRec.setInputByte(source);
   }  
   
     /**
	 * 	Update InputByte 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputByte(Field source, int sourceIndex,int sourceLen) {
      inputRec.setInputByte(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InputByte 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputByte(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputRec.setInputByte(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of out
	 *	@return out
	 */   
	 public Out getOut() {
   	return out;
   }



        public TstcdpagCtx getTstcdpagCtx() {
            return TstcdpagCtx.this;
        }

        public ProcessOutputOutCtx getProcessOutputOutCtx() {
            return new ProcessOutputOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inputRec.hashCode();
        str += outputRec.hashCode();
        str += miscData.hashCode();
        str += out.hashCode();
       return str.hashCode();
    }

    public ProcessOutputInCtx clone() {
        ProcessOutputInCtx cloneObj = new ProcessOutputInCtx();
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.out = new Out();
        cloneObj.out.set(out.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutputInCtx getProcessOutputInCtx() {
            return new ProcessOutputInCtx();
    }
     public class ProcessOutputOutCtx implements Cloneable {
     InputRec inputRec = TstcdpagCtx.this.getInputRec();
     OutputRec outputRec = TstcdpagCtx.this.getOutputRec();
     MiscData miscData = TstcdpagCtx.this.getMiscData();
     Out out = TstcdpagCtx.this.getOut();

	/**
	 *	Test condition new byte[] {(byte)0x3A} for isValHex3a()
	 *	@return  Returns true if isValHex3a() is new byte[] {(byte)0x3A}
	 */
   public boolean isValHex3a() throws CFException {
      return out.isValHex3a();
   }

	/**
	*  set values new byte[] {(byte)0x3A}
	*/
   	public void setValHex3aTrue()  throws CFException{  			
    	out.setValHex3aTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x77} for isValHex77()
	 *	@return  Returns true if isValHex77() is new byte[] {(byte)0x77}
	 */
   public boolean isValHex77() throws CFException {
      return out.isValHex77();
   }

	/**
	*  set values new byte[] {(byte)0x77}
	*/
   	public void setValHex77True()  throws CFException{  			
    	out.setValHex77True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x26} for isValHex26()
	 *	@return  Returns true if isValHex26() is new byte[] {(byte)0x26}
	 */
   public boolean isValHex26() throws CFException {
      return out.isValHex26();
   }

	/**
	*  set values new byte[] {(byte)0x26}
	*/
   	public void setValHex26True()  throws CFException{  			
    	out.setValHex26True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x28} for isValHex28()
	 *	@return  Returns true if isValHex28() is new byte[] {(byte)0x28}
	 */
   public boolean isValHex28() throws CFException {
      return out.isValHex28();
   }

	/**
	*  set values new byte[] {(byte)0x28}
	*/
   	public void setValHex28True()  throws CFException{  			
    	out.setValHex28True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x09} for isValHex09()
	 *	@return  Returns true if isValHex09() is new byte[] {(byte)0x09}
	 */
   public boolean isValHex09() throws CFException {
      return out.isValHex09();
   }

	/**
	*  set values new byte[] {(byte)0x09}
	*/
   	public void setValHex09True()  throws CFException{  			
    	out.setValHex09True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x24} for isValHex24()
	 *	@return  Returns true if isValHex24() is new byte[] {(byte)0x24}
	 */
   public boolean isValHex24() throws CFException {
      return out.isValHex24();
   }

	/**
	*  set values new byte[] {(byte)0x24}
	*/
   	public void setValHex24True()  throws CFException{  			
    	out.setValHex24True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x9E} for isValHex9e()
	 *	@return  Returns true if isValHex9e() is new byte[] {(byte)0x9E}
	 */
   public boolean isValHex9e() throws CFException {
      return out.isValHex9e();
   }

	/**
	*  set values new byte[] {(byte)0x9E}
	*/
   	public void setValHex9eTrue()  throws CFException{  			
    	out.setValHex9eTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x0A} for isValHex0a()
	 *	@return  Returns true if isValHex0a() is new byte[] {(byte)0x0A}
	 */
   public boolean isValHex0a() throws CFException {
      return out.isValHex0a();
   }

	/**
	*  set values new byte[] {(byte)0x0A}
	*/
   	public void setValHex0aTrue()  throws CFException{  			
    	out.setValHex0aTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x63} for isValHex63()
	 *	@return  Returns true if isValHex63() is new byte[] {(byte)0x63}
	 */
   public boolean isValHex63() throws CFException {
      return out.isValHex63();
   }

	/**
	*  set values new byte[] {(byte)0x63}
	*/
   	public void setValHex63True()  throws CFException{  			
    	out.setValHex63True();
   	}
	/**
	 *	Test condition "6" for isValHexF6()
	 *	@return  Returns true if isValHexF6() is "6"
	 */
   public boolean isValHexF6() throws CFException {
      return out.isValHexF6();
   }

	/**
	*  set values "6"
	*/
   	public void setValHexF6True()  throws CFException{  			
    	out.setValHexF6True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x3F} for isValHex3f()
	 *	@return  Returns true if isValHex3f() is new byte[] {(byte)0x3F}
	 */
   public boolean isValHex3f() throws CFException {
      return out.isValHex3f();
   }

	/**
	*  set values new byte[] {(byte)0x3F}
	*/
   	public void setValHex3fTrue()  throws CFException{  			
    	out.setValHex3fTrue();
   	}
	/**
	 *	Test condition "9" for isValHexF9()
	 *	@return  Returns true if isValHexF9() is "9"
	 */
   public boolean isValHexF9() throws CFException {
      return out.isValHexF9();
   }

	/**
	*  set values "9"
	*/
   	public void setValHexF9True()  throws CFException{  			
    	out.setValHexF9True();
   	}
	/**
	 *	Test condition "^" for isValHex5f()
	 *	@return  Returns true if isValHex5f() is "^"
	 */
   public boolean isValHex5f() throws CFException {
      return out.isValHex5f();
   }

	/**
	*  set values "^"
	*/
   	public void setValHex5fTrue()  throws CFException{  			
    	out.setValHex5fTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x08} for isValHex08()
	 *	@return  Returns true if isValHex08() is new byte[] {(byte)0x08}
	 */
   public boolean isValHex08() throws CFException {
      return out.isValHex08();
   }

	/**
	*  set values new byte[] {(byte)0x08}
	*/
   	public void setValHex08True()  throws CFException{  			
    	out.setValHex08True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xCA} for isValHexCa()
	 *	@return  Returns true if isValHexCa() is new byte[] {(byte)0xCA}
	 */
   public boolean isValHexCa() throws CFException {
      return out.isValHexCa();
   }

	/**
	*  set values new byte[] {(byte)0xCA}
	*/
   	public void setValHexCaTrue()  throws CFException{  			
    	out.setValHexCaTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x1F} for isValHex1f()
	 *	@return  Returns true if isValHex1f() is new byte[] {(byte)0x1F}
	 */
   public boolean isValHex1f() throws CFException {
      return out.isValHex1f();
   }

	/**
	*  set values new byte[] {(byte)0x1F}
	*/
   	public void setValHex1fTrue()  throws CFException{  			
    	out.setValHex1fTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x8C} for isValHex8c()
	 *	@return  Returns true if isValHex8c() is new byte[] {(byte)0x8C}
	 */
   public boolean isValHex8c() throws CFException {
      return out.isValHex8c();
   }

	/**
	*  set values new byte[] {(byte)0x8C}
	*/
   	public void setValHex8cTrue()  throws CFException{  			
    	out.setValHex8cTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xEB} for isValHexEb()
	 *	@return  Returns true if isValHexEb() is new byte[] {(byte)0xEB}
	 */
   public boolean isValHexEb() throws CFException {
      return out.isValHexEb();
   }

	/**
	*  set values new byte[] {(byte)0xEB}
	*/
   	public void setValHexEbTrue()  throws CFException{  			
    	out.setValHexEbTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xFD} for isValHexFd()
	 *	@return  Returns true if isValHexFd() is new byte[] {(byte)0xFD}
	 */
   public boolean isValHexFd() throws CFException {
      return out.isValHexFd();
   }

	/**
	*  set values new byte[] {(byte)0xFD}
	*/
   	public void setValHexFdTrue()  throws CFException{  			
    	out.setValHexFdTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x25} for isValHex25()
	 *	@return  Returns true if isValHex25() is new byte[] {(byte)0x25}
	 */
   public boolean isValHex25() throws CFException {
      return out.isValHex25();
   }

	/**
	*  set values new byte[] {(byte)0x25}
	*/
   	public void setValHex25True()  throws CFException{  			
    	out.setValHex25True();
   	}
	/**
	 *	Test condition "*" for isValHex5c()
	 *	@return  Returns true if isValHex5c() is "*"
	 */
   public boolean isValHex5c() throws CFException {
      return out.isValHex5c();
   }

	/**
	*  set values "*"
	*/
   	public void setValHex5cTrue()  throws CFException{  			
    	out.setValHex5cTrue();
   	}
	/**
	 *	Test condition "o" for isValHex96()
	 *	@return  Returns true if isValHex96() is "o"
	 */
   public boolean isValHex96() throws CFException {
      return out.isValHex96();
   }

	/**
	*  set values "o"
	*/
   	public void setValHex96True()  throws CFException{  			
    	out.setValHex96True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x15} for isValHex15()
	 *	@return  Returns true if isValHex15() is new byte[] {(byte)0x15}
	 */
   public boolean isValHex15() throws CFException {
      return out.isValHex15();
   }

	/**
	*  set values new byte[] {(byte)0x15}
	*/
   	public void setValHex15True()  throws CFException{  			
    	out.setValHex15True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x68} for isValHex68()
	 *	@return  Returns true if isValHex68() is new byte[] {(byte)0x68}
	 */
   public boolean isValHex68() throws CFException {
      return out.isValHex68();
   }

	/**
	*  set values new byte[] {(byte)0x68}
	*/
   	public void setValHex68True()  throws CFException{  			
    	out.setValHex68True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xDF} for isValHexDf()
	 *	@return  Returns true if isValHexDf() is new byte[] {(byte)0xDF}
	 */
   public boolean isValHexDf() throws CFException {
      return out.isValHexDf();
   }

	/**
	*  set values new byte[] {(byte)0xDF}
	*/
   	public void setValHexDfTrue()  throws CFException{  			
    	out.setValHexDfTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x1A} for isValHex1a()
	 *	@return  Returns true if isValHex1a() is new byte[] {(byte)0x1A}
	 */
   public boolean isValHex1a() throws CFException {
      return out.isValHex1a();
   }

	/**
	*  set values new byte[] {(byte)0x1A}
	*/
   	public void setValHex1aTrue()  throws CFException{  			
    	out.setValHex1aTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x2E} for isValHex2e()
	 *	@return  Returns true if isValHex2e() is new byte[] {(byte)0x2E}
	 */
   public boolean isValHex2e() throws CFException {
      return out.isValHex2e();
   }

	/**
	*  set values new byte[] {(byte)0x2E}
	*/
   	public void setValHex2eTrue()  throws CFException{  			
    	out.setValHex2eTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x18} for isValHex18()
	 *	@return  Returns true if isValHex18() is new byte[] {(byte)0x18}
	 */
   public boolean isValHex18() throws CFException {
      return out.isValHex18();
   }

	/**
	*  set values new byte[] {(byte)0x18}
	*/
   	public void setValHex18True()  throws CFException{  			
    	out.setValHex18True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x31} for isValHex31()
	 *	@return  Returns true if isValHex31() is new byte[] {(byte)0x31}
	 */
   public boolean isValHex31() throws CFException {
      return out.isValHex31();
   }

	/**
	*  set values new byte[] {(byte)0x31}
	*/
   	public void setValHex31True()  throws CFException{  			
    	out.setValHex31True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xFC} for isValHexFc()
	 *	@return  Returns true if isValHexFc() is new byte[] {(byte)0xFC}
	 */
   public boolean isValHexFc() throws CFException {
      return out.isValHexFc();
   }

	/**
	*  set values new byte[] {(byte)0xFC}
	*/
   	public void setValHexFcTrue()  throws CFException{  			
    	out.setValHexFcTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x0C} for isValHex0c()
	 *	@return  Returns true if isValHex0c() is new byte[] {(byte)0x0C}
	 */
   public boolean isValHex0c() throws CFException {
      return out.isValHex0c();
   }

	/**
	*  set values new byte[] {(byte)0x0C}
	*/
   	public void setValHex0cTrue()  throws CFException{  			
    	out.setValHex0cTrue();
   	}
	/**
	 *	Test condition "a" for isValHex81()
	 *	@return  Returns true if isValHex81() is "a"
	 */
   public boolean isValHex81() throws CFException {
      return out.isValHex81();
   }

	/**
	*  set values "a"
	*/
   	public void setValHex81True()  throws CFException{  			
    	out.setValHex81True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x74} for isValHex74()
	 *	@return  Returns true if isValHex74() is new byte[] {(byte)0x74}
	 */
   public boolean isValHex74() throws CFException {
      return out.isValHex74();
   }

	/**
	*  set values new byte[] {(byte)0x74}
	*/
   	public void setValHex74True()  throws CFException{  			
    	out.setValHex74True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x34} for isValHex34()
	 *	@return  Returns true if isValHex34() is new byte[] {(byte)0x34}
	 */
   public boolean isValHex34() throws CFException {
      return out.isValHex34();
   }

	/**
	*  set values new byte[] {(byte)0x34}
	*/
   	public void setValHex34True()  throws CFException{  			
    	out.setValHex34True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x72} for isValHex72()
	 *	@return  Returns true if isValHex72() is new byte[] {(byte)0x72}
	 */
   public boolean isValHex72() throws CFException {
      return out.isValHex72();
   }

	/**
	*  set values new byte[] {(byte)0x72}
	*/
   	public void setValHex72True()  throws CFException{  			
    	out.setValHex72True();
   	}
	/**
	 *	Test condition "q" for isValHex98()
	 *	@return  Returns true if isValHex98() is "q"
	 */
   public boolean isValHex98() throws CFException {
      return out.isValHex98();
   }

	/**
	*  set values "q"
	*/
   	public void setValHex98True()  throws CFException{  			
    	out.setValHex98True();
   	}
	/**
	 *	Test condition "z" for isValHexA9()
	 *	@return  Returns true if isValHexA9() is "z"
	 */
   public boolean isValHexA9() throws CFException {
      return out.isValHexA9();
   }

	/**
	*  set values "z"
	*/
   	public void setValHexA9True()  throws CFException{  			
    	out.setValHexA9True();
   	}
	/**
	 *	Test condition "B" for isValHexC2()
	 *	@return  Returns true if isValHexC2() is "B"
	 */
   public boolean isValHexC2() throws CFException {
      return out.isValHexC2();
   }

	/**
	*  set values "B"
	*/
   	public void setValHexC2True()  throws CFException{  			
    	out.setValHexC2True();
   	}
	/**
	 *	Test condition "I" for isValHexC9()
	 *	@return  Returns true if isValHexC9() is "I"
	 */
   public boolean isValHexC9() throws CFException {
      return out.isValHexC9();
   }

	/**
	*  set values "I"
	*/
   	public void setValHexC9True()  throws CFException{  			
    	out.setValHexC9True();
   	}
	/**
	 *	Test condition "7" for isValHexF7()
	 *	@return  Returns true if isValHexF7() is "7"
	 */
   public boolean isValHexF7() throws CFException {
      return out.isValHexF7();
   }

	/**
	*  set values "7"
	*/
   	public void setValHexF7True()  throws CFException{  			
    	out.setValHexF7True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xAE} for isValHexAe()
	 *	@return  Returns true if isValHexAe() is new byte[] {(byte)0xAE}
	 */
   public boolean isValHexAe() throws CFException {
      return out.isValHexAe();
   }

	/**
	*  set values new byte[] {(byte)0xAE}
	*/
   	public void setValHexAeTrue()  throws CFException{  			
    	out.setValHexAeTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x66} for isValHex66()
	 *	@return  Returns true if isValHex66() is new byte[] {(byte)0x66}
	 */
   public boolean isValHex66() throws CFException {
      return out.isValHex66();
   }

	/**
	*  set values new byte[] {(byte)0x66}
	*/
   	public void setValHex66True()  throws CFException{  			
    	out.setValHex66True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xEF} for isValHexEf()
	 *	@return  Returns true if isValHexEf() is new byte[] {(byte)0xEF}
	 */
   public boolean isValHexEf() throws CFException {
      return out.isValHexEf();
   }

	/**
	*  set values new byte[] {(byte)0xEF}
	*/
   	public void setValHexEfTrue()  throws CFException{  			
    	out.setValHexEfTrue();
   	}
	/**
	 *	Test condition "X" for isValHexE7()
	 *	@return  Returns true if isValHexE7() is "X"
	 */
   public boolean isValHexE7() throws CFException {
      return out.isValHexE7();
   }

	/**
	*  set values "X"
	*/
   	public void setValHexE7True()  throws CFException{  			
    	out.setValHexE7True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xDE} for isValHexDe()
	 *	@return  Returns true if isValHexDe() is new byte[] {(byte)0xDE}
	 */
   public boolean isValHexDe() throws CFException {
      return out.isValHexDe();
   }

	/**
	*  set values new byte[] {(byte)0xDE}
	*/
   	public void setValHexDeTrue()  throws CFException{  			
    	out.setValHexDeTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x80} for isValHex80()
	 *	@return  Returns true if isValHex80() is new byte[] {(byte)0x80}
	 */
   public boolean isValHex80() throws CFException {
      return out.isValHex80();
   }

	/**
	*  set values new byte[] {(byte)0x80}
	*/
   	public void setValHex80True()  throws CFException{  			
    	out.setValHex80True();
   	}
	/**
	 *	Test condition "v" for isValHexA5()
	 *	@return  Returns true if isValHexA5() is "v"
	 */
   public boolean isValHexA5() throws CFException {
      return out.isValHexA5();
   }

	/**
	*  set values "v"
	*/
   	public void setValHexA5True()  throws CFException{  			
    	out.setValHexA5True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x73} for isValHex73()
	 *	@return  Returns true if isValHex73() is new byte[] {(byte)0x73}
	 */
   public boolean isValHex73() throws CFException {
      return out.isValHex73();
   }

	/**
	*  set values new byte[] {(byte)0x73}
	*/
   	public void setValHex73True()  throws CFException{  			
    	out.setValHex73True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xB8} for isValHexB8()
	 *	@return  Returns true if isValHexB8() is new byte[] {(byte)0xB8}
	 */
   public boolean isValHexB8() throws CFException {
      return out.isValHexB8();
   }

	/**
	*  set values new byte[] {(byte)0xB8}
	*/
   	public void setValHexB8True()  throws CFException{  			
    	out.setValHexB8True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x3D} for isValHex3d()
	 *	@return  Returns true if isValHex3d() is new byte[] {(byte)0x3D}
	 */
   public boolean isValHex3d() throws CFException {
      return out.isValHex3d();
   }

	/**
	*  set values new byte[] {(byte)0x3D}
	*/
   	public void setValHex3dTrue()  throws CFException{  			
    	out.setValHex3dTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x06} for isValHex06()
	 *	@return  Returns true if isValHex06() is new byte[] {(byte)0x06}
	 */
   public boolean isValHex06() throws CFException {
      return out.isValHex06();
   }

	/**
	*  set values new byte[] {(byte)0x06}
	*/
   	public void setValHex06True()  throws CFException{  			
    	out.setValHex06True();
   	}
	/**
	 *	Test condition "l" for isValHex93()
	 *	@return  Returns true if isValHex93() is "l"
	 */
   public boolean isValHex93() throws CFException {
      return out.isValHex93();
   }

	/**
	*  set values "l"
	*/
   	public void setValHex93True()  throws CFException{  			
    	out.setValHex93True();
   	}
	/**
	 *	Test condition "U" for isValHexE4()
	 *	@return  Returns true if isValHexE4() is "U"
	 */
   public boolean isValHexE4() throws CFException {
      return out.isValHexE4();
   }

	/**
	*  set values "U"
	*/
   	public void setValHexE4True()  throws CFException{  			
    	out.setValHexE4True();
   	}
	/**
	 *	Test condition "y" for isValHexA8()
	 *	@return  Returns true if isValHexA8() is "y"
	 */
   public boolean isValHexA8() throws CFException {
      return out.isValHexA8();
   }

	/**
	*  set values "y"
	*/
   	public void setValHexA8True()  throws CFException{  			
    	out.setValHexA8True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x61} for isValHex61()
	 *	@return  Returns true if isValHex61() is new byte[] {(byte)0x61}
	 */
   public boolean isValHex61() throws CFException {
      return out.isValHex61();
   }

	/**
	*  set values new byte[] {(byte)0x61}
	*/
   	public void setValHex61True()  throws CFException{  			
    	out.setValHex61True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x64} for isValHex64()
	 *	@return  Returns true if isValHex64() is new byte[] {(byte)0x64}
	 */
   public boolean isValHex64() throws CFException {
      return out.isValHex64();
   }

	/**
	*  set values new byte[] {(byte)0x64}
	*/
   	public void setValHex64True()  throws CFException{  			
    	out.setValHex64True();
   	}
	/**
	 *	Test condition "j" for isValHex91()
	 *	@return  Returns true if isValHex91() is "j"
	 */
   public boolean isValHex91() throws CFException {
      return out.isValHex91();
   }

	/**
	*  set values "j"
	*/
   	public void setValHex91True()  throws CFException{  			
    	out.setValHex91True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x67} for isValHex67()
	 *	@return  Returns true if isValHex67() is new byte[] {(byte)0x67}
	 */
   public boolean isValHex67() throws CFException {
      return out.isValHex67();
   }

	/**
	*  set values new byte[] {(byte)0x67}
	*/
   	public void setValHex67True()  throws CFException{  			
    	out.setValHex67True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x59} for isValHex59()
	 *	@return  Returns true if isValHex59() is new byte[] {(byte)0x59}
	 */
   public boolean isValHex59() throws CFException {
      return out.isValHex59();
   }

	/**
	*  set values new byte[] {(byte)0x59}
	*/
   	public void setValHex59True()  throws CFException{  			
    	out.setValHex59True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xDD} for isValHexDd()
	 *	@return  Returns true if isValHexDd() is new byte[] {(byte)0xDD}
	 */
   public boolean isValHexDd() throws CFException {
      return out.isValHexDd();
   }

	/**
	*  set values new byte[] {(byte)0xDD}
	*/
   	public void setValHexDdTrue()  throws CFException{  			
    	out.setValHexDdTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x03} for isValHex03()
	 *	@return  Returns true if isValHex03() is new byte[] {(byte)0x03}
	 */
   public boolean isValHex03() throws CFException {
      return out.isValHex03();
   }

	/**
	*  set values new byte[] {(byte)0x03}
	*/
   	public void setValHex03True()  throws CFException{  			
    	out.setValHex03True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x38} for isValHex38()
	 *	@return  Returns true if isValHex38() is new byte[] {(byte)0x38}
	 */
   public boolean isValHex38() throws CFException {
      return out.isValHex38();
   }

	/**
	*  set values new byte[] {(byte)0x38}
	*/
   	public void setValHex38True()  throws CFException{  			
    	out.setValHex38True();
   	}
	/**
	 *	Test condition "c" for isValHex83()
	 *	@return  Returns true if isValHex83() is "c"
	 */
   public boolean isValHex83() throws CFException {
      return out.isValHex83();
   }

	/**
	*  set values "c"
	*/
   	public void setValHex83True()  throws CFException{  			
    	out.setValHex83True();
   	}
	/**
	 *	Test condition "_" for isValHex6d()
	 *	@return  Returns true if isValHex6d() is "_"
	 */
   public boolean isValHex6d() throws CFException {
      return out.isValHex6d();
   }

	/**
	*  set values "_"
	*/
   	public void setValHex6dTrue()  throws CFException{  			
    	out.setValHex6dTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xB9} for isValHexB9()
	 *	@return  Returns true if isValHexB9() is new byte[] {(byte)0xB9}
	 */
   public boolean isValHexB9() throws CFException {
      return out.isValHexB9();
   }

	/**
	*  set values new byte[] {(byte)0xB9}
	*/
   	public void setValHexB9True()  throws CFException{  			
    	out.setValHexB9True();
   	}
	/**
	 *	Test condition "5" for isValHexF5()
	 *	@return  Returns true if isValHexF5() is "5"
	 */
   public boolean isValHexF5() throws CFException {
      return out.isValHexF5();
   }

	/**
	*  set values "5"
	*/
   	public void setValHexF5True()  throws CFException{  			
    	out.setValHexF5True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x11} for isValHex11()
	 *	@return  Returns true if isValHex11() is new byte[] {(byte)0x11}
	 */
   public boolean isValHex11() throws CFException {
      return out.isValHex11();
   }

	/**
	*  set values new byte[] {(byte)0x11}
	*/
   	public void setValHex11True()  throws CFException{  			
    	out.setValHex11True();
   	}
	/**
	 *	Test condition "b" for isValHex82()
	 *	@return  Returns true if isValHex82() is "b"
	 */
   public boolean isValHex82() throws CFException {
      return out.isValHex82();
   }

	/**
	*  set values "b"
	*/
   	public void setValHex82True()  throws CFException{  			
    	out.setValHex82True();
   	}
	/**
	 *	Test condition "(" for isValHex4d()
	 *	@return  Returns true if isValHex4d() is "("
	 */
   public boolean isValHex4d() throws CFException {
      return out.isValHex4d();
   }

	/**
	*  set values "("
	*/
   	public void setValHex4dTrue()  throws CFException{  			
    	out.setValHex4dTrue();
   	}
	/**
	 *	Test condition "x" for isValHexA7()
	 *	@return  Returns true if isValHexA7() is "x"
	 */
   public boolean isValHexA7() throws CFException {
      return out.isValHexA7();
   }

	/**
	*  set values "x"
	*/
   	public void setValHexA7True()  throws CFException{  			
    	out.setValHexA7True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x78} for isValHex78()
	 *	@return  Returns true if isValHex78() is new byte[] {(byte)0x78}
	 */
   public boolean isValHex78() throws CFException {
      return out.isValHex78();
   }

	/**
	*  set values new byte[] {(byte)0x78}
	*/
   	public void setValHex78True()  throws CFException{  			
    	out.setValHex78True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x36} for isValHex36()
	 *	@return  Returns true if isValHex36() is new byte[] {(byte)0x36}
	 */
   public boolean isValHex36() throws CFException {
      return out.isValHex36();
   }

	/**
	*  set values new byte[] {(byte)0x36}
	*/
   	public void setValHex36True()  throws CFException{  			
    	out.setValHex36True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x7F} for isValHex7f()
	 *	@return  Returns true if isValHex7f() is new byte[] {(byte)0x7F}
	 */
   public boolean isValHex7f() throws CFException {
      return out.isValHex7f();
   }

	/**
	*  set values new byte[] {(byte)0x7F}
	*/
   	public void setValHex7fTrue()  throws CFException{  			
    	out.setValHex7fTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x2D} for isValHex2d()
	 *	@return  Returns true if isValHex2d() is new byte[] {(byte)0x2D}
	 */
   public boolean isValHex2d() throws CFException {
      return out.isValHex2d();
   }

	/**
	*  set values new byte[] {(byte)0x2D}
	*/
   	public void setValHex2dTrue()  throws CFException{  			
    	out.setValHex2dTrue();
   	}
	/**
	 *	Test condition ")" for isValHex5d()
	 *	@return  Returns true if isValHex5d() is ")"
	 */
   public boolean isValHex5d() throws CFException {
      return out.isValHex5d();
   }

	/**
	*  set values ")"
	*/
   	public void setValHex5dTrue()  throws CFException{  			
    	out.setValHex5dTrue();
   	}
	/**
	 *	Test condition "\\" for isValHexE0()
	 *	@return  Returns true if isValHexE0() is "\\"
	 */
   public boolean isValHexE0() throws CFException {
      return out.isValHexE0();
   }

	/**
	*  set values "\\"
	*/
   	public void setValHexE0True()  throws CFException{  			
    	out.setValHexE0True();
   	}
	/**
	 *	Test condition ">" for isValHex6e()
	 *	@return  Returns true if isValHex6e() is ">"
	 */
   public boolean isValHex6e() throws CFException {
      return out.isValHex6e();
   }

	/**
	*  set values ">"
	*/
   	public void setValHex6eTrue()  throws CFException{  			
    	out.setValHex6eTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x07} for isValHex07()
	 *	@return  Returns true if isValHex07() is new byte[] {(byte)0x07}
	 */
   public boolean isValHex07() throws CFException {
      return out.isValHex07();
   }

	/**
	*  set values new byte[] {(byte)0x07}
	*/
   	public void setValHex07True()  throws CFException{  			
    	out.setValHex07True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x21} for isValHex21()
	 *	@return  Returns true if isValHex21() is new byte[] {(byte)0x21}
	 */
   public boolean isValHex21() throws CFException {
      return out.isValHex21();
   }

	/**
	*  set values new byte[] {(byte)0x21}
	*/
   	public void setValHex21True()  throws CFException{  			
    	out.setValHex21True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xAB} for isValHexAb()
	 *	@return  Returns true if isValHexAb() is new byte[] {(byte)0xAB}
	 */
   public boolean isValHexAb() throws CFException {
      return out.isValHexAb();
   }

	/**
	*  set values new byte[] {(byte)0xAB}
	*/
   	public void setValHexAbTrue()  throws CFException{  			
    	out.setValHexAbTrue();
   	}
	/**
	 *	Test condition "+" for isValHex4e()
	 *	@return  Returns true if isValHex4e() is "+"
	 */
   public boolean isValHex4e() throws CFException {
      return out.isValHex4e();
   }

	/**
	*  set values "+"
	*/
   	public void setValHex4eTrue()  throws CFException{  			
    	out.setValHex4eTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xFB} for isValHexFb()
	 *	@return  Returns true if isValHexFb() is new byte[] {(byte)0xFB}
	 */
   public boolean isValHexFb() throws CFException {
      return out.isValHexFb();
   }

	/**
	*  set values new byte[] {(byte)0xFB}
	*/
   	public void setValHexFbTrue()  throws CFException{  			
    	out.setValHexFbTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x3C} for isValHex3c()
	 *	@return  Returns true if isValHex3c() is new byte[] {(byte)0x3C}
	 */
   public boolean isValHex3c() throws CFException {
      return out.isValHex3c();
   }

	/**
	*  set values new byte[] {(byte)0x3C}
	*/
   	public void setValHex3cTrue()  throws CFException{  			
    	out.setValHex3cTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x55} for isValHex55()
	 *	@return  Returns true if isValHex55() is new byte[] {(byte)0x55}
	 */
   public boolean isValHex55() throws CFException {
      return out.isValHex55();
   }

	/**
	*  set values new byte[] {(byte)0x55}
	*/
   	public void setValHex55True()  throws CFException{  			
    	out.setValHex55True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xB1} for isValHexB1()
	 *	@return  Returns true if isValHexB1() is new byte[] {(byte)0xB1}
	 */
   public boolean isValHexB1() throws CFException {
      return out.isValHexB1();
   }

	/**
	*  set values new byte[] {(byte)0xB1}
	*/
   	public void setValHexB1True()  throws CFException{  			
    	out.setValHexB1True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xE1} for isValHexE1()
	 *	@return  Returns true if isValHexE1() is new byte[] {(byte)0xE1}
	 */
   public boolean isValHexE1() throws CFException {
      return out.isValHexE1();
   }

	/**
	*  set values new byte[] {(byte)0xE1}
	*/
   	public void setValHexE1True()  throws CFException{  			
    	out.setValHexE1True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xFA} for isValHexFa()
	 *	@return  Returns true if isValHexFa() is new byte[] {(byte)0xFA}
	 */
   public boolean isValHexFa() throws CFException {
      return out.isValHexFa();
   }

	/**
	*  set values new byte[] {(byte)0xFA}
	*/
   	public void setValHexFaTrue()  throws CFException{  			
    	out.setValHexFaTrue();
   	}
	/**
	 *	Test condition "L" for isValHexD3()
	 *	@return  Returns true if isValHexD3() is "L"
	 */
   public boolean isValHexD3() throws CFException {
      return out.isValHexD3();
   }

	/**
	*  set values "L"
	*/
   	public void setValHexD3True()  throws CFException{  			
    	out.setValHexD3True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xAF} for isValHexAf()
	 *	@return  Returns true if isValHexAf() is new byte[] {(byte)0xAF}
	 */
   public boolean isValHexAf() throws CFException {
      return out.isValHexAf();
   }

	/**
	*  set values new byte[] {(byte)0xAF}
	*/
   	public void setValHexAfTrue()  throws CFException{  			
    	out.setValHexAfTrue();
   	}
	/**
	 *	Test condition ":" for isValHex7a()
	 *	@return  Returns true if isValHex7a() is ":"
	 */
   public boolean isValHex7a() throws CFException {
      return out.isValHex7a();
   }

	/**
	*  set values ":"
	*/
   	public void setValHex7aTrue()  throws CFException{  			
    	out.setValHex7aTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x13} for isValHex13()
	 *	@return  Returns true if isValHex13() is new byte[] {(byte)0x13}
	 */
   public boolean isValHex13() throws CFException {
      return out.isValHex13();
   }

	/**
	*  set values new byte[] {(byte)0x13}
	*/
   	public void setValHex13True()  throws CFException{  			
    	out.setValHex13True();
   	}
	/**
	 *	Test condition "J" for isValHexD1()
	 *	@return  Returns true if isValHexD1() is "J"
	 */
   public boolean isValHexD1() throws CFException {
      return out.isValHexD1();
   }

	/**
	*  set values "J"
	*/
   	public void setValHexD1True()  throws CFException{  			
    	out.setValHexD1True();
   	}
	/**
	 *	Test condition "S" for isValHexE2()
	 *	@return  Returns true if isValHexE2() is "S"
	 */
   public boolean isValHexE2() throws CFException {
      return out.isValHexE2();
   }

	/**
	*  set values "S"
	*/
   	public void setValHexE2True()  throws CFException{  			
    	out.setValHexE2True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x05} for isValHex05()
	 *	@return  Returns true if isValHex05() is new byte[] {(byte)0x05}
	 */
   public boolean isValHex05() throws CFException {
      return out.isValHex05();
   }

	/**
	*  set values new byte[] {(byte)0x05}
	*/
   	public void setValHex05True()  throws CFException{  			
    	out.setValHex05True();
   	}
	/**
	 *	Test condition " " for isValHex40()
	 *	@return  Returns true if isValHex40() is " "
	 */
   public boolean isValHex40() throws CFException {
      return out.isValHex40();
   }

	/**
	*  set values " "
	*/
   	public void setValHex40True()  throws CFException{  			
    	out.setValHex40True();
   	}
	/**
	 *	Test condition "k" for isValHex92()
	 *	@return  Returns true if isValHex92() is "k"
	 */
   public boolean isValHex92() throws CFException {
      return out.isValHex92();
   }

	/**
	*  set values "k"
	*/
   	public void setValHex92True()  throws CFException{  			
    	out.setValHex92True();
   	}
	/**
	 *	Test condition "1" for isValHexF1()
	 *	@return  Returns true if isValHexF1() is "1"
	 */
   public boolean isValHexF1() throws CFException {
      return out.isValHexF1();
   }

	/**
	*  set values "1"
	*/
   	public void setValHexF1True()  throws CFException{  			
    	out.setValHexF1True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xB3} for isValHexB3()
	 *	@return  Returns true if isValHexB3() is new byte[] {(byte)0xB3}
	 */
   public boolean isValHexB3() throws CFException {
      return out.isValHexB3();
   }

	/**
	*  set values new byte[] {(byte)0xB3}
	*/
   	public void setValHexB3True()  throws CFException{  			
    	out.setValHexB3True();
   	}
	/**
	 *	Test condition "Z" for isValHexE9()
	 *	@return  Returns true if isValHexE9() is "Z"
	 */
   public boolean isValHexE9() throws CFException {
      return out.isValHexE9();
   }

	/**
	*  set values "Z"
	*/
   	public void setValHexE9True()  throws CFException{  			
    	out.setValHexE9True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x19} for isValHex19()
	 *	@return  Returns true if isValHex19() is new byte[] {(byte)0x19}
	 */
   public boolean isValHex19() throws CFException {
      return out.isValHex19();
   }

	/**
	*  set values new byte[] {(byte)0x19}
	*/
   	public void setValHex19True()  throws CFException{  			
    	out.setValHex19True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x1C} for isValHex1c()
	 *	@return  Returns true if isValHex1c() is new byte[] {(byte)0x1C}
	 */
   public boolean isValHex1c() throws CFException {
      return out.isValHex1c();
   }

	/**
	*  set values new byte[] {(byte)0x1C}
	*/
   	public void setValHex1cTrue()  throws CFException{  			
    	out.setValHex1cTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x41} for isValHex41()
	 *	@return  Returns true if isValHex41() is new byte[] {(byte)0x41}
	 */
   public boolean isValHex41() throws CFException {
      return out.isValHex41();
   }

	/**
	*  set values new byte[] {(byte)0x41}
	*/
   	public void setValHex41True()  throws CFException{  			
    	out.setValHex41True();
   	}
	/**
	 *	Returns the value of inputByte
	 *	@return inputByte
	 */
   public char[] getInputByte() throws CFException  {              
   		return inputRec.getInputByte();
   }

  
	/**
	*  set variable inputByte
	*  @param value
	**/
   public void setInputByte(char[] value) throws CFException {
      inputRec.setInputByte(value);
   } 

     /**
	 * 	Update InputByte 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputByte(char[] source, int sourceIndex) throws CFException {
      inputRec.setInputByte(source, sourceIndex);
   	
   }
   
   public void setInputByte(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      inputRec.setInputByte(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InputByte 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputByte(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputRec.setInputByte(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InputByte with another Field
	 *	@param value
	 */
   public void setInputByte(Field source) {
      inputRec.setInputByte(source);
   }  
   
     /**
	 * 	Update InputByte 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputByte(Field source, int sourceIndex,int sourceLen) {
      inputRec.setInputByte(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InputByte 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputByte(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputRec.setInputByte(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "K" for isValHexD2()
	 *	@return  Returns true if isValHexD2() is "K"
	 */
   public boolean isValHexD2() throws CFException {
      return out.isValHexD2();
   }

	/**
	*  set values "K"
	*/
   	public void setValHexD2True()  throws CFException{  			
    	out.setValHexD2True();
   	}
	/**
	 *	Test condition "3" for isValHexF3()
	 *	@return  Returns true if isValHexF3() is "3"
	 */
   public boolean isValHexF3() throws CFException {
      return out.isValHexF3();
   }

	/**
	*  set values "3"
	*/
   	public void setValHexF3True()  throws CFException{  			
    	out.setValHexF3True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xEA} for isValHexEa()
	 *	@return  Returns true if isValHexEa() is new byte[] {(byte)0xEA}
	 */
   public boolean isValHexEa() throws CFException {
      return out.isValHexEa();
   }

	/**
	*  set values new byte[] {(byte)0xEA}
	*/
   	public void setValHexEaTrue()  throws CFException{  			
    	out.setValHexEaTrue();
   	}
	/**
	 *	Test condition "P" for isValHexD7()
	 *	@return  Returns true if isValHexD7() is "P"
	 */
   public boolean isValHexD7() throws CFException {
      return out.isValHexD7();
   }

	/**
	*  set values "P"
	*/
   	public void setValHexD7True()  throws CFException{  			
    	out.setValHexD7True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xB0} for isValHexB0()
	 *	@return  Returns true if isValHexB0() is new byte[] {(byte)0xB0}
	 */
   public boolean isValHexB0() throws CFException {
      return out.isValHexB0();
   }

	/**
	*  set values new byte[] {(byte)0xB0}
	*/
   	public void setValHexB0True()  throws CFException{  			
    	out.setValHexB0True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x9A} for isValHex9a()
	 *	@return  Returns true if isValHex9a() is new byte[] {(byte)0x9A}
	 */
   public boolean isValHex9a() throws CFException {
      return out.isValHex9a();
   }

	/**
	*  set values new byte[] {(byte)0x9A}
	*/
   	public void setValHex9aTrue()  throws CFException{  			
    	out.setValHex9aTrue();
   	}
	/**
	 *	Test condition "E" for isValHexC5()
	 *	@return  Returns true if isValHexC5() is "E"
	 */
   public boolean isValHexC5() throws CFException {
      return out.isValHexC5();
   }

	/**
	*  set values "E"
	*/
   	public void setValHexC5True()  throws CFException{  			
    	out.setValHexC5True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xBC} for isValHexBc()
	 *	@return  Returns true if isValHexBc() is new byte[] {(byte)0xBC}
	 */
   public boolean isValHexBc() throws CFException {
      return out.isValHexBc();
   }

	/**
	*  set values new byte[] {(byte)0xBC}
	*/
   	public void setValHexBcTrue()  throws CFException{  			
    	out.setValHexBcTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x46} for isValHex46()
	 *	@return  Returns true if isValHex46() is new byte[] {(byte)0x46}
	 */
   public boolean isValHex46() throws CFException {
      return out.isValHex46();
   }

	/**
	*  set values new byte[] {(byte)0x46}
	*/
   	public void setValHex46True()  throws CFException{  			
    	out.setValHex46True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x04} for isValHex04()
	 *	@return  Returns true if isValHex04() is new byte[] {(byte)0x04}
	 */
   public boolean isValHex04() throws CFException {
      return out.isValHex04();
   }

	/**
	*  set values new byte[] {(byte)0x04}
	*/
   	public void setValHex04True()  throws CFException{  			
    	out.setValHex04True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xA0} for isValHexA0()
	 *	@return  Returns true if isValHexA0() is new byte[] {(byte)0xA0}
	 */
   public boolean isValHexA0() throws CFException {
      return out.isValHexA0();
   }

	/**
	*  set values new byte[] {(byte)0xA0}
	*/
   	public void setValHexA0True()  throws CFException{  			
    	out.setValHexA0True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x75} for isValHex75()
	 *	@return  Returns true if isValHex75() is new byte[] {(byte)0x75}
	 */
   public boolean isValHex75() throws CFException {
      return out.isValHex75();
   }

	/**
	*  set values new byte[] {(byte)0x75}
	*/
   	public void setValHex75True()  throws CFException{  			
    	out.setValHex75True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x12} for isValHex12()
	 *	@return  Returns true if isValHex12() is new byte[] {(byte)0x12}
	 */
   public boolean isValHex12() throws CFException {
      return out.isValHex12();
   }

	/**
	*  set values new byte[] {(byte)0x12}
	*/
   	public void setValHex12True()  throws CFException{  			
    	out.setValHex12True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x47} for isValHex47()
	 *	@return  Returns true if isValHex47() is new byte[] {(byte)0x47}
	 */
   public boolean isValHex47() throws CFException {
      return out.isValHex47();
   }

	/**
	*  set values new byte[] {(byte)0x47}
	*/
   	public void setValHex47True()  throws CFException{  			
    	out.setValHex47True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xBF} for isValHexBf()
	 *	@return  Returns true if isValHexBf() is new byte[] {(byte)0xBF}
	 */
   public boolean isValHexBf() throws CFException {
      return out.isValHexBf();
   }

	/**
	*  set values new byte[] {(byte)0xBF}
	*/
   	public void setValHexBfTrue()  throws CFException{  			
    	out.setValHexBfTrue();
   	}
	/**
	 *	Test condition "i" for isValHex89()
	 *	@return  Returns true if isValHex89() is "i"
	 */
   public boolean isValHex89() throws CFException {
      return out.isValHex89();
   }

	/**
	*  set values "i"
	*/
   	public void setValHex89True()  throws CFException{  			
    	out.setValHex89True();
   	}
	/**
	 *	Test condition "w" for isValHexA6()
	 *	@return  Returns true if isValHexA6() is "w"
	 */
   public boolean isValHexA6() throws CFException {
      return out.isValHexA6();
   }

	/**
	*  set values "w"
	*/
   	public void setValHexA6True()  throws CFException{  			
    	out.setValHexA6True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x10} for isValHex10()
	 *	@return  Returns true if isValHex10() is new byte[] {(byte)0x10}
	 */
   public boolean isValHex10() throws CFException {
      return out.isValHex10();
   }

	/**
	*  set values new byte[] {(byte)0x10}
	*/
   	public void setValHex10True()  throws CFException{  			
    	out.setValHex10True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x43} for isValHex43()
	 *	@return  Returns true if isValHex43() is new byte[] {(byte)0x43}
	 */
   public boolean isValHex43() throws CFException {
      return out.isValHex43();
   }

	/**
	*  set values new byte[] {(byte)0x43}
	*/
   	public void setValHex43True()  throws CFException{  			
    	out.setValHex43True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x57} for isValHex57()
	 *	@return  Returns true if isValHex57() is new byte[] {(byte)0x57}
	 */
   public boolean isValHex57() throws CFException {
      return out.isValHex57();
   }

	/**
	*  set values new byte[] {(byte)0x57}
	*/
   	public void setValHex57True()  throws CFException{  			
    	out.setValHex57True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x58} for isValHex58()
	 *	@return  Returns true if isValHex58() is new byte[] {(byte)0x58}
	 */
   public boolean isValHex58() throws CFException {
      return out.isValHex58();
   }

	/**
	*  set values new byte[] {(byte)0x58}
	*/
   	public void setValHex58True()  throws CFException{  			
    	out.setValHex58True();
   	}
	/**
	 *	Returns the value of outputData
	 *	@return outputData
	 */
   public char[] getOutputData() throws CFException  {              
   		return outputRec.getOutputData();
   }

  
	/**
	*  set variable outputData
	*  @param value
	**/
   public void setOutputData(char[] value) throws CFException {
      outputRec.setOutputData(value);
   } 

     /**
	 * 	Update OutputData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutputData(char[] source, int sourceIndex) throws CFException {
      outputRec.setOutputData(source, sourceIndex);
   	
   }
   
   public void setOutputData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      outputRec.setOutputData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OutputData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutputData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      outputRec.setOutputData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OutputData with another Field
	 *	@param value
	 */
   public void setOutputData(Field source) {
      outputRec.setOutputData(source);
   }  
   
     /**
	 * 	Update OutputData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutputData(Field source, int sourceIndex,int sourceLen) {
      outputRec.setOutputData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OutputData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutputData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      outputRec.setOutputData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "m" for isValHex94()
	 *	@return  Returns true if isValHex94() is "m"
	 */
   public boolean isValHex94() throws CFException {
      return out.isValHex94();
   }

	/**
	*  set values "m"
	*/
   	public void setValHex94True()  throws CFException{  			
    	out.setValHex94True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x8A} for isValHex8a()
	 *	@return  Returns true if isValHex8a() is new byte[] {(byte)0x8A}
	 */
   public boolean isValHex8a() throws CFException {
      return out.isValHex8a();
   }

	/**
	*  set values new byte[] {(byte)0x8A}
	*/
   	public void setValHex8aTrue()  throws CFException{  			
    	out.setValHex8aTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x23} for isValHex23()
	 *	@return  Returns true if isValHex23() is new byte[] {(byte)0x23}
	 */
   public boolean isValHex23() throws CFException {
      return out.isValHex23();
   }

	/**
	*  set values new byte[] {(byte)0x23}
	*/
   	public void setValHex23True()  throws CFException{  			
    	out.setValHex23True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x39} for isValHex39()
	 *	@return  Returns true if isValHex39() is new byte[] {(byte)0x39}
	 */
   public boolean isValHex39() throws CFException {
      return out.isValHex39();
   }

	/**
	*  set values new byte[] {(byte)0x39}
	*/
   	public void setValHex39True()  throws CFException{  			
    	out.setValHex39True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x9B} for isValHex9b()
	 *	@return  Returns true if isValHex9b() is new byte[] {(byte)0x9B}
	 */
   public boolean isValHex9b() throws CFException {
      return out.isValHex9b();
   }

	/**
	*  set values new byte[] {(byte)0x9B}
	*/
   	public void setValHex9bTrue()  throws CFException{  			
    	out.setValHex9bTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x01} for isValHex01()
	 *	@return  Returns true if isValHex01() is new byte[] {(byte)0x01}
	 */
   public boolean isValHex01() throws CFException {
      return out.isValHex01();
   }

	/**
	*  set values new byte[] {(byte)0x01}
	*/
   	public void setValHex01True()  throws CFException{  			
    	out.setValHex01True();
   	}
	/**
	 *	Test condition "R" for isValHexD9()
	 *	@return  Returns true if isValHexD9() is "R"
	 */
   public boolean isValHexD9() throws CFException {
      return out.isValHexD9();
   }

	/**
	*  set values "R"
	*/
   	public void setValHexD9True()  throws CFException{  			
    	out.setValHexD9True();
   	}
	/**
	 *	Test condition "@" for isValHex7c()
	 *	@return  Returns true if isValHex7c() is "@"
	 */
   public boolean isValHex7c() throws CFException {
      return out.isValHex7c();
   }

	/**
	*  set values "@"
	*/
   	public void setValHex7cTrue()  throws CFException{  			
    	out.setValHex7cTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x56} for isValHex56()
	 *	@return  Returns true if isValHex56() is new byte[] {(byte)0x56}
	 */
   public boolean isValHex56() throws CFException {
      return out.isValHex56();
   }

	/**
	*  set values new byte[] {(byte)0x56}
	*/
   	public void setValHex56True()  throws CFException{  			
    	out.setValHex56True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x8B} for isValHex8b()
	 *	@return  Returns true if isValHex8b() is new byte[] {(byte)0x8B}
	 */
   public boolean isValHex8b() throws CFException {
      return out.isValHex8b();
   }

	/**
	*  set values new byte[] {(byte)0x8B}
	*/
   	public void setValHex8bTrue()  throws CFException{  			
    	out.setValHex8bTrue();
   	}
	/**
	 *	Test condition "V" for isValHexE5()
	 *	@return  Returns true if isValHexE5() is "V"
	 */
   public boolean isValHexE5() throws CFException {
      return out.isValHexE5();
   }

	/**
	*  set values "V"
	*/
   	public void setValHexE5True()  throws CFException{  			
    	out.setValHexE5True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isValHexFf()
	 *	@return  Returns true if isValHexFf() is new byte[] {(byte)0xFF}
	 */
   public boolean isValHexFf() throws CFException {
      return out.isValHexFf();
   }

	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setValHexFfTrue()  throws CFException{  			
    	out.setValHexFfTrue();
   	}
	/**
	 *	Test condition "p" for isValHex97()
	 *	@return  Returns true if isValHex97() is "p"
	 */
   public boolean isValHex97() throws CFException {
      return out.isValHex97();
   }

	/**
	*  set values "p"
	*/
   	public void setValHex97True()  throws CFException{  			
    	out.setValHex97True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x54} for isValHex54()
	 *	@return  Returns true if isValHex54() is new byte[] {(byte)0x54}
	 */
   public boolean isValHex54() throws CFException {
      return out.isValHex54();
   }

	/**
	*  set values new byte[] {(byte)0x54}
	*/
   	public void setValHex54True()  throws CFException{  			
    	out.setValHex54True();
   	}
	/**
	 *	Test condition "4" for isValHexF4()
	 *	@return  Returns true if isValHexF4() is "4"
	 */
   public boolean isValHexF4() throws CFException {
      return out.isValHexF4();
   }

	/**
	*  set values "4"
	*/
   	public void setValHexF4True()  throws CFException{  			
    	out.setValHexF4True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x52} for isValHex52()
	 *	@return  Returns true if isValHex52() is new byte[] {(byte)0x52}
	 */
   public boolean isValHex52() throws CFException {
      return out.isValHex52();
   }

	/**
	*  set values new byte[] {(byte)0x52}
	*/
   	public void setValHex52True()  throws CFException{  			
    	out.setValHex52True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xB5} for isValHexB5()
	 *	@return  Returns true if isValHexB5() is new byte[] {(byte)0xB5}
	 */
   public boolean isValHexB5() throws CFException {
      return out.isValHexB5();
   }

	/**
	*  set values new byte[] {(byte)0xB5}
	*/
   	public void setValHexB5True()  throws CFException{  			
    	out.setValHexB5True();
   	}
	/**
	 *	Test condition "n" for isValHex95()
	 *	@return  Returns true if isValHex95() is "n"
	 */
   public boolean isValHex95() throws CFException {
      return out.isValHex95();
   }

	/**
	*  set values "n"
	*/
   	public void setValHex95True()  throws CFException{  			
    	out.setValHex95True();
   	}
	/**
	 *	Returns the value of outputStatus
	 *	@return outputStatus
	 */
	public int getOutputStatus() throws CFException {
   		return miscData.getOutputStatus();
	}


	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() throws CFException {
	     return String.valueOf(miscData.getOutputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric()  throws CFException{
	    return miscData.outputStatusIsNumeric();
	}

	/**
	 * 	Update OutputStatus with the passed value
	 *	@param number
	 */
	public void setOutputStatus(int number)  throws CFException{
		miscData.setOutputStatus(number);
	}
	

	public void setOutputStatus(long number)  throws CFException{
	    miscData.setOutputStatus(number);
	}
	
	
	/**
	 * 	Update OutputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutputStatus(char[] value)  throws CFException {
		miscData.setOutputStatus(value);
	}
	
	/**
	 * 	Update OutputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutputStatusString(char[] value)  throws CFException{
		miscData.setOutputStatus(value);
	}	

	/**
	 *	Test condition new byte[] {(byte)0x2A} for isValHex2a()
	 *	@return  Returns true if isValHex2a() is new byte[] {(byte)0x2A}
	 */
   public boolean isValHex2a() throws CFException {
      return out.isValHex2a();
   }

	/**
	*  set values new byte[] {(byte)0x2A}
	*/
   	public void setValHex2aTrue()  throws CFException{  			
    	out.setValHex2aTrue();
   	}
	/**
	 *	Test condition "f" for isValHex86()
	 *	@return  Returns true if isValHex86() is "f"
	 */
   public boolean isValHex86() throws CFException {
      return out.isValHex86();
   }

	/**
	*  set values "f"
	*/
   	public void setValHex86True()  throws CFException{  			
    	out.setValHex86True();
   	}
	/**
	 *	Test condition "#" for isValHex7b()
	 *	@return  Returns true if isValHex7b() is "#"
	 */
   public boolean isValHex7b() throws CFException {
      return out.isValHex7b();
   }

	/**
	*  set values "#"
	*/
   	public void setValHex7bTrue()  throws CFException{  			
    	out.setValHex7bTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x8D} for isValHex8d()
	 *	@return  Returns true if isValHex8d() is new byte[] {(byte)0x8D}
	 */
   public boolean isValHex8d() throws CFException {
      return out.isValHex8d();
   }

	/**
	*  set values new byte[] {(byte)0x8D}
	*/
   	public void setValHex8dTrue()  throws CFException{  			
    	out.setValHex8dTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x8E} for isValHex8e()
	 *	@return  Returns true if isValHex8e() is new byte[] {(byte)0x8E}
	 */
   public boolean isValHex8e() throws CFException {
      return out.isValHex8e();
   }

	/**
	*  set values new byte[] {(byte)0x8E}
	*/
   	public void setValHex8eTrue()  throws CFException{  			
    	out.setValHex8eTrue();
   	}
	/**
	 *	Test condition "}" for isValHexD0()
	 *	@return  Returns true if isValHexD0() is "}"
	 */
   public boolean isValHexD0() throws CFException {
      return out.isValHexD0();
   }

	/**
	*  set values "}"
	*/
   	public void setValHexD0True()  throws CFException{  			
    	out.setValHexD0True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xEC} for isValHexEc()
	 *	@return  Returns true if isValHexEc() is new byte[] {(byte)0xEC}
	 */
   public boolean isValHexEc() throws CFException {
      return out.isValHexEc();
   }

	/**
	*  set values new byte[] {(byte)0xEC}
	*/
   	public void setValHexEcTrue()  throws CFException{  			
    	out.setValHexEcTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x00} for isValHex00()
	 *	@return  Returns true if isValHex00() is new byte[] {(byte)0x00}
	 */
   public boolean isValHex00() throws CFException {
      return out.isValHex00();
   }

	/**
	*  set values new byte[] {(byte)0x00}
	*/
   	public void setValHex00True()  throws CFException{  			
    	out.setValHex00True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xAC} for isValHexAc()
	 *	@return  Returns true if isValHexAc() is new byte[] {(byte)0xAC}
	 */
   public boolean isValHexAc() throws CFException {
      return out.isValHexAc();
   }

	/**
	*  set values new byte[] {(byte)0xAC}
	*/
   	public void setValHexAcTrue()  throws CFException{  			
    	out.setValHexAcTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x49} for isValHex49()
	 *	@return  Returns true if isValHex49() is new byte[] {(byte)0x49}
	 */
   public boolean isValHex49() throws CFException {
      return out.isValHex49();
   }

	/**
	*  set values new byte[] {(byte)0x49}
	*/
   	public void setValHex49True()  throws CFException{  			
    	out.setValHex49True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xAA} for isValHexAa()
	 *	@return  Returns true if isValHexAa() is new byte[] {(byte)0xAA}
	 */
   public boolean isValHexAa() throws CFException {
      return out.isValHexAa();
   }

	/**
	*  set values new byte[] {(byte)0xAA}
	*/
   	public void setValHexAaTrue()  throws CFException{  			
    	out.setValHexAaTrue();
   	}
	/**
	 *	Returns the value of nonDisplayableStr
	 *	@return nonDisplayableStr
	 */
   public char[] getNonDisplayableStr() throws CFException  {              
   		return out.getNonDisplayableStr();
   }

  
	/**
	*  set variable nonDisplayableStr
	*  @param value
	**/
   public void setNonDisplayableStr(char[] value) throws CFException {
      out.setNonDisplayableStr(value);
   } 

     /**
	 * 	Update NonDisplayableStr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNonDisplayableStr(char[] source, int sourceIndex) throws CFException {
      out.setNonDisplayableStr(source, sourceIndex);
   	
   }
   
   public void setNonDisplayableStr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      out.setNonDisplayableStr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NonDisplayableStr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNonDisplayableStr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      out.setNonDisplayableStr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NonDisplayableStr with another Field
	 *	@param value
	 */
   public void setNonDisplayableStr(Field source) {
      out.setNonDisplayableStr(source);
   }  
   
     /**
	 * 	Update NonDisplayableStr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNonDisplayableStr(Field source, int sourceIndex,int sourceLen) {
      out.setNonDisplayableStr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NonDisplayableStr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNonDisplayableStr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      out.setNonDisplayableStr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isValHexE8()
	 *	@return  Returns true if isValHexE8() is "Y"
	 */
   public boolean isValHexE8() throws CFException {
      return out.isValHexE8();
   }

	/**
	*  set values "Y"
	*/
   	public void setValHexE8True()  throws CFException{  			
    	out.setValHexE8True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x32} for isValHex32()
	 *	@return  Returns true if isValHex32() is new byte[] {(byte)0x32}
	 */
   public boolean isValHex32() throws CFException {
      return out.isValHex32();
   }

	/**
	*  set values new byte[] {(byte)0x32}
	*/
   	public void setValHex32True()  throws CFException{  			
    	out.setValHex32True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x2B} for isValHex2b()
	 *	@return  Returns true if isValHex2b() is new byte[] {(byte)0x2B}
	 */
   public boolean isValHex2b() throws CFException {
      return out.isValHex2b();
   }

	/**
	*  set values new byte[] {(byte)0x2B}
	*/
   	public void setValHex2bTrue()  throws CFException{  			
    	out.setValHex2bTrue();
   	}
	/**
	 *	Test condition "$" for isValHex5b()
	 *	@return  Returns true if isValHex5b() is "$"
	 */
   public boolean isValHex5b() throws CFException {
      return out.isValHex5b();
   }

	/**
	*  set values "$"
	*/
   	public void setValHex5bTrue()  throws CFException{  			
    	out.setValHex5bTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x17} for isValHex17()
	 *	@return  Returns true if isValHex17() is new byte[] {(byte)0x17}
	 */
   public boolean isValHex17() throws CFException {
      return out.isValHex17();
   }

	/**
	*  set values new byte[] {(byte)0x17}
	*/
   	public void setValHex17True()  throws CFException{  			
    	out.setValHex17True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xDC} for isValHexDc()
	 *	@return  Returns true if isValHexDc() is new byte[] {(byte)0xDC}
	 */
   public boolean isValHexDc() throws CFException {
      return out.isValHexDc();
   }

	/**
	*  set values new byte[] {(byte)0xDC}
	*/
   	public void setValHexDcTrue()  throws CFException{  			
    	out.setValHexDcTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x0F} for isValHex0f()
	 *	@return  Returns true if isValHex0f() is new byte[] {(byte)0x0F}
	 */
   public boolean isValHex0f() throws CFException {
      return out.isValHex0f();
   }

	/**
	*  set values new byte[] {(byte)0x0F}
	*/
   	public void setValHex0fTrue()  throws CFException{  			
    	out.setValHex0fTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x35} for isValHex35()
	 *	@return  Returns true if isValHex35() is new byte[] {(byte)0x35}
	 */
   public boolean isValHex35() throws CFException {
      return out.isValHex35();
   }

	/**
	*  set values new byte[] {(byte)0x35}
	*/
   	public void setValHex35True()  throws CFException{  			
    	out.setValHex35True();
   	}
	/**
	 *	Test condition "A" for isValHexC1()
	 *	@return  Returns true if isValHexC1() is "A"
	 */
   public boolean isValHexC1() throws CFException {
      return out.isValHexC1();
   }

	/**
	*  set values "A"
	*/
   	public void setValHexC1True()  throws CFException{  			
    	out.setValHexC1True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xEE} for isValHexEe()
	 *	@return  Returns true if isValHexEe() is new byte[] {(byte)0xEE}
	 */
   public boolean isValHexEe() throws CFException {
      return out.isValHexEe();
   }

	/**
	*  set values new byte[] {(byte)0xEE}
	*/
   	public void setValHexEeTrue()  throws CFException{  			
    	out.setValHexEeTrue();
   	}
	/**
	 *	Test condition "8" for isValHexF8()
	 *	@return  Returns true if isValHexF8() is "8"
	 */
   public boolean isValHexF8() throws CFException {
      return out.isValHexF8();
   }

	/**
	*  set values "8"
	*/
   	public void setValHexF8True()  throws CFException{  			
    	out.setValHexF8True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xCD} for isValHexCd()
	 *	@return  Returns true if isValHexCd() is new byte[] {(byte)0xCD}
	 */
   public boolean isValHexCd() throws CFException {
      return out.isValHexCd();
   }

	/**
	*  set values new byte[] {(byte)0xCD}
	*/
   	public void setValHexCdTrue()  throws CFException{  			
    	out.setValHexCdTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x3E} for isValHex3e()
	 *	@return  Returns true if isValHex3e() is new byte[] {(byte)0x3E}
	 */
   public boolean isValHex3e() throws CFException {
      return out.isValHex3e();
   }

	/**
	*  set values new byte[] {(byte)0x3E}
	*/
   	public void setValHex3eTrue()  throws CFException{  			
    	out.setValHex3eTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x60} for isValHex60()
	 *	@return  Returns true if isValHex60() is new byte[] {(byte)0x60}
	 */
   public boolean isValHex60() throws CFException {
      return out.isValHex60();
   }

	/**
	*  set values new byte[] {(byte)0x60}
	*/
   	public void setValHex60True()  throws CFException{  			
    	out.setValHex60True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xB7} for isValHexB7()
	 *	@return  Returns true if isValHexB7() is new byte[] {(byte)0xB7}
	 */
   public boolean isValHexB7() throws CFException {
      return out.isValHexB7();
   }

	/**
	*  set values new byte[] {(byte)0xB7}
	*/
   	public void setValHexB7True()  throws CFException{  			
    	out.setValHexB7True();
   	}
	/**
	 *	Test condition "T" for isValHexE3()
	 *	@return  Returns true if isValHexE3() is "T"
	 */
   public boolean isValHexE3() throws CFException {
      return out.isValHexE3();
   }

	/**
	*  set values "T"
	*/
   	public void setValHexE3True()  throws CFException{  			
    	out.setValHexE3True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xAD} for isValHexAd()
	 *	@return  Returns true if isValHexAd() is new byte[] {(byte)0xAD}
	 */
   public boolean isValHexAd() throws CFException {
      return out.isValHexAd();
   }

	/**
	*  set values new byte[] {(byte)0xAD}
	*/
   	public void setValHexAdTrue()  throws CFException{  			
    	out.setValHexAdTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x48} for isValHex48()
	 *	@return  Returns true if isValHex48() is new byte[] {(byte)0x48}
	 */
   public boolean isValHex48() throws CFException {
      return out.isValHex48();
   }

	/**
	*  set values new byte[] {(byte)0x48}
	*/
   	public void setValHex48True()  throws CFException{  			
    	out.setValHex48True();
   	}
	/**
	 *	Test condition "0" for isValHexF0()
	 *	@return  Returns true if isValHexF0() is "0"
	 */
   public boolean isValHexF0() throws CFException {
      return out.isValHexF0();
   }

	/**
	*  set values "0"
	*/
   	public void setValHexF0True()  throws CFException{  			
    	out.setValHexF0True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x22} for isValHex22()
	 *	@return  Returns true if isValHex22() is new byte[] {(byte)0x22}
	 */
   public boolean isValHex22() throws CFException {
      return out.isValHex22();
   }

	/**
	*  set values new byte[] {(byte)0x22}
	*/
   	public void setValHex22True()  throws CFException{  			
    	out.setValHex22True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x02} for isValHex02()
	 *	@return  Returns true if isValHex02() is new byte[] {(byte)0x02}
	 */
   public boolean isValHex02() throws CFException {
      return out.isValHex02();
   }

	/**
	*  set values new byte[] {(byte)0x02}
	*/
   	public void setValHex02True()  throws CFException{  			
    	out.setValHex02True();
   	}
	/**
	 *	Test condition "s" for isValHexA2()
	 *	@return  Returns true if isValHexA2() is "s"
	 */
   public boolean isValHexA2() throws CFException {
      return out.isValHexA2();
   }

	/**
	*  set values "s"
	*/
   	public void setValHexA2True()  throws CFException{  			
    	out.setValHexA2True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xFE} for isValHexFe()
	 *	@return  Returns true if isValHexFe() is new byte[] {(byte)0xFE}
	 */
   public boolean isValHexFe() throws CFException {
      return out.isValHexFe();
   }

	/**
	*  set values new byte[] {(byte)0xFE}
	*/
   	public void setValHexFeTrue()  throws CFException{  			
    	out.setValHexFeTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xBD} for isValHexBd()
	 *	@return  Returns true if isValHexBd() is new byte[] {(byte)0xBD}
	 */
   public boolean isValHexBd() throws CFException {
      return out.isValHexBd();
   }

	/**
	*  set values new byte[] {(byte)0xBD}
	*/
   	public void setValHexBdTrue()  throws CFException{  			
    	out.setValHexBdTrue();
   	}
	/**
	 *	Test condition "!" for isValHex5a()
	 *	@return  Returns true if isValHex5a() is "!"
	 */
   public boolean isValHex5a() throws CFException {
      return out.isValHex5a();
   }

	/**
	*  set values "!"
	*/
   	public void setValHex5aTrue()  throws CFException{  			
    	out.setValHex5aTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x20} for isValHex20()
	 *	@return  Returns true if isValHex20() is new byte[] {(byte)0x20}
	 */
   public boolean isValHex20() throws CFException {
      return out.isValHex20();
   }

	/**
	*  set values new byte[] {(byte)0x20}
	*/
   	public void setValHex20True()  throws CFException{  			
    	out.setValHex20True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x45} for isValHex45()
	 *	@return  Returns true if isValHex45() is new byte[] {(byte)0x45}
	 */
   public boolean isValHex45() throws CFException {
      return out.isValHex45();
   }

	/**
	*  set values new byte[] {(byte)0x45}
	*/
   	public void setValHex45True()  throws CFException{  			
    	out.setValHex45True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x71} for isValHex71()
	 *	@return  Returns true if isValHex71() is new byte[] {(byte)0x71}
	 */
   public boolean isValHex71() throws CFException {
      return out.isValHex71();
   }

	/**
	*  set values new byte[] {(byte)0x71}
	*/
   	public void setValHex71True()  throws CFException{  			
    	out.setValHex71True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x51} for isValHex51()
	 *	@return  Returns true if isValHex51() is new byte[] {(byte)0x51}
	 */
   public boolean isValHex51() throws CFException {
      return out.isValHex51();
   }

	/**
	*  set values new byte[] {(byte)0x51}
	*/
   	public void setValHex51True()  throws CFException{  			
    	out.setValHex51True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x90} for isValHex90()
	 *	@return  Returns true if isValHex90() is new byte[] {(byte)0x90}
	 */
   public boolean isValHex90() throws CFException {
      return out.isValHex90();
   }

	/**
	*  set values new byte[] {(byte)0x90}
	*/
   	public void setValHex90True()  throws CFException{  			
    	out.setValHex90True();
   	}
	/**
	 *	Test condition "r" for isValHex99()
	 *	@return  Returns true if isValHex99() is "r"
	 */
   public boolean isValHex99() throws CFException {
      return out.isValHex99();
   }

	/**
	*  set values "r"
	*/
   	public void setValHex99True()  throws CFException{  			
    	out.setValHex99True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x65} for isValHex65()
	 *	@return  Returns true if isValHex65() is new byte[] {(byte)0x65}
	 */
   public boolean isValHex65() throws CFException {
      return out.isValHex65();
   }

	/**
	*  set values new byte[] {(byte)0x65}
	*/
   	public void setValHex65True()  throws CFException{  			
    	out.setValHex65True();
   	}
	/**
	 *	Test condition "W" for isValHexE6()
	 *	@return  Returns true if isValHexE6() is "W"
	 */
   public boolean isValHexE6() throws CFException {
      return out.isValHexE6();
   }

	/**
	*  set values "W"
	*/
   	public void setValHexE6True()  throws CFException{  			
    	out.setValHexE6True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xDB} for isValHexDb()
	 *	@return  Returns true if isValHexDb() is new byte[] {(byte)0xDB}
	 */
   public boolean isValHexDb() throws CFException {
      return out.isValHexDb();
   }

	/**
	*  set values new byte[] {(byte)0xDB}
	*/
   	public void setValHexDbTrue()  throws CFException{  			
    	out.setValHexDbTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x0D} for isValHex0d()
	 *	@return  Returns true if isValHex0d() is new byte[] {(byte)0x0D}
	 */
   public boolean isValHex0d() throws CFException {
      return out.isValHex0d();
   }

	/**
	*  set values new byte[] {(byte)0x0D}
	*/
   	public void setValHex0dTrue()  throws CFException{  			
    	out.setValHex0dTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x4A} for isValHex4a()
	 *	@return  Returns true if isValHex4a() is new byte[] {(byte)0x4A}
	 */
   public boolean isValHex4a() throws CFException {
      return out.isValHex4a();
   }

	/**
	*  set values new byte[] {(byte)0x4A}
	*/
   	public void setValHex4aTrue()  throws CFException{  			
    	out.setValHex4aTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x9C} for isValHex9c()
	 *	@return  Returns true if isValHex9c() is new byte[] {(byte)0x9C}
	 */
   public boolean isValHex9c() throws CFException {
      return out.isValHex9c();
   }

	/**
	*  set values new byte[] {(byte)0x9C}
	*/
   	public void setValHex9cTrue()  throws CFException{  			
    	out.setValHex9cTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xBE} for isValHexBe()
	 *	@return  Returns true if isValHexBe() is new byte[] {(byte)0xBE}
	 */
   public boolean isValHexBe() throws CFException {
      return out.isValHexBe();
   }

	/**
	*  set values new byte[] {(byte)0xBE}
	*/
   	public void setValHexBeTrue()  throws CFException{  			
    	out.setValHexBeTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x42} for isValHex42()
	 *	@return  Returns true if isValHex42() is new byte[] {(byte)0x42}
	 */
   public boolean isValHex42() throws CFException {
      return out.isValHex42();
   }

	/**
	*  set values new byte[] {(byte)0x42}
	*/
   	public void setValHex42True()  throws CFException{  			
    	out.setValHex42True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x44} for isValHex44()
	 *	@return  Returns true if isValHex44() is new byte[] {(byte)0x44}
	 */
   public boolean isValHex44() throws CFException {
      return out.isValHex44();
   }

	/**
	*  set values new byte[] {(byte)0x44}
	*/
   	public void setValHex44True()  throws CFException{  			
    	out.setValHex44True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xBA} for isValHexBa()
	 *	@return  Returns true if isValHexBa() is new byte[] {(byte)0xBA}
	 */
   public boolean isValHexBa() throws CFException {
      return out.isValHexBa();
   }

	/**
	*  set values new byte[] {(byte)0xBA}
	*/
   	public void setValHexBaTrue()  throws CFException{  			
    	out.setValHexBaTrue();
   	}
	/**
	 *	Test condition "{" for isValHexC0()
	 *	@return  Returns true if isValHexC0() is "{"
	 */
   public boolean isValHexC0() throws CFException {
      return out.isValHexC0();
   }

	/**
	*  set values "{"
	*/
   	public void setValHexC0True()  throws CFException{  			
    	out.setValHexC0True();
   	}
	/**
	 *	Test condition "D" for isValHexC4()
	 *	@return  Returns true if isValHexC4() is "D"
	 */
   public boolean isValHexC4() throws CFException {
      return out.isValHexC4();
   }

	/**
	*  set values "D"
	*/
   	public void setValHexC4True()  throws CFException{  			
    	out.setValHexC4True();
   	}
	/**
	 *	Test condition "G" for isValHexC7()
	 *	@return  Returns true if isValHexC7() is "G"
	 */
   public boolean isValHexC7() throws CFException {
      return out.isValHexC7();
   }

	/**
	*  set values "G"
	*/
   	public void setValHexC7True()  throws CFException{  			
    	out.setValHexC7True();
   	}
	/**
	 *	Test condition "t" for isValHexA3()
	 *	@return  Returns true if isValHexA3() is "t"
	 */
   public boolean isValHexA3() throws CFException {
      return out.isValHexA3();
   }

	/**
	*  set values "t"
	*/
   	public void setValHexA3True()  throws CFException{  			
    	out.setValHexA3True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x2F} for isValHex2f()
	 *	@return  Returns true if isValHex2f() is new byte[] {(byte)0x2F}
	 */
   public boolean isValHex2f() throws CFException {
      return out.isValHex2f();
   }

	/**
	*  set values new byte[] {(byte)0x2F}
	*/
   	public void setValHex2fTrue()  throws CFException{  			
    	out.setValHex2fTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x3B} for isValHex3b()
	 *	@return  Returns true if isValHex3b() is new byte[] {(byte)0x3B}
	 */
   public boolean isValHex3b() throws CFException {
      return out.isValHex3b();
   }

	/**
	*  set values new byte[] {(byte)0x3B}
	*/
   	public void setValHex3bTrue()  throws CFException{  			
    	out.setValHex3bTrue();
   	}
	/**
	 *	Test condition "2" for isValHexF2()
	 *	@return  Returns true if isValHexF2() is "2"
	 */
   public boolean isValHexF2() throws CFException {
      return out.isValHexF2();
   }

	/**
	*  set values "2"
	*/
   	public void setValHexF2True()  throws CFException{  			
    	out.setValHexF2True();
   	}
	/**
	 *	Returns the value of hexChar
	 *	@return hexChar
	 */
   public char[] getHexChar() throws CFException  {              
   		return out.getHexChar();
   }

  
	/**
	*  set variable hexChar
	*  @param value
	**/
   public void setHexChar(char[] value) throws CFException {
      out.setHexChar(value);
   } 

     /**
	 * 	Update HexChar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHexChar(char[] source, int sourceIndex) throws CFException {
      out.setHexChar(source, sourceIndex);
   	
   }
   
   public void setHexChar(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      out.setHexChar(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HexChar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHexChar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      out.setHexChar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HexChar with another Field
	 *	@param value
	 */
   public void setHexChar(Field source) {
      out.setHexChar(source);
   }  
   
     /**
	 * 	Update HexChar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHexChar(Field source, int sourceIndex,int sourceLen) {
      out.setHexChar(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HexChar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHexChar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      out.setHexChar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition new byte[] {(byte)0x0E} for isValHex0e()
	 *	@return  Returns true if isValHex0e() is new byte[] {(byte)0x0E}
	 */
   public boolean isValHex0e() throws CFException {
      return out.isValHex0e();
   }

	/**
	*  set values new byte[] {(byte)0x0E}
	*/
   	public void setValHex0eTrue()  throws CFException{  			
    	out.setValHex0eTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xBB} for isValHexBb()
	 *	@return  Returns true if isValHexBb() is new byte[] {(byte)0xBB}
	 */
   public boolean isValHexBb() throws CFException {
      return out.isValHexBb();
   }

	/**
	*  set values new byte[] {(byte)0xBB}
	*/
   	public void setValHexBbTrue()  throws CFException{  			
    	out.setValHexBbTrue();
   	}
	/**
	 *	Test condition ";" for isValHex5e()
	 *	@return  Returns true if isValHex5e() is ";"
	 */
   public boolean isValHex5e() throws CFException {
      return out.isValHex5e();
   }

	/**
	*  set values ";"
	*/
   	public void setValHex5eTrue()  throws CFException{  			
    	out.setValHex5eTrue();
   	}
	/**
	 *	Test condition "O" for isValHexD6()
	 *	@return  Returns true if isValHexD6() is "O"
	 */
   public boolean isValHexD6() throws CFException {
      return out.isValHexD6();
   }

	/**
	*  set values "O"
	*/
   	public void setValHexD6True()  throws CFException{  			
    	out.setValHexD6True();
   	}
	/**
	 *	Test condition "=" for isValHex7e()
	 *	@return  Returns true if isValHex7e() is "="
	 */
   public boolean isValHex7e() throws CFException {
      return out.isValHex7e();
   }

	/**
	*  set values "="
	*/
   	public void setValHex7eTrue()  throws CFException{  			
    	out.setValHex7eTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x9D} for isValHex9d()
	 *	@return  Returns true if isValHex9d() is new byte[] {(byte)0x9D}
	 */
   public boolean isValHex9d() throws CFException {
      return out.isValHex9d();
   }

	/**
	*  set values new byte[] {(byte)0x9D}
	*/
   	public void setValHex9dTrue()  throws CFException{  			
    	out.setValHex9dTrue();
   	}
	/**
	 *	Test condition "H" for isValHexC8()
	 *	@return  Returns true if isValHexC8() is "H"
	 */
   public boolean isValHexC8() throws CFException {
      return out.isValHexC8();
   }

	/**
	*  set values "H"
	*/
   	public void setValHexC8True()  throws CFException{  			
    	out.setValHexC8True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xCB} for isValHexCb()
	 *	@return  Returns true if isValHexCb() is new byte[] {(byte)0xCB}
	 */
   public boolean isValHexCb() throws CFException {
      return out.isValHexCb();
   }

	/**
	*  set values new byte[] {(byte)0xCB}
	*/
   	public void setValHexCbTrue()  throws CFException{  			
    	out.setValHexCbTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xB6} for isValHexB6()
	 *	@return  Returns true if isValHexB6() is new byte[] {(byte)0xB6}
	 */
   public boolean isValHexB6() throws CFException {
      return out.isValHexB6();
   }

	/**
	*  set values new byte[] {(byte)0xB6}
	*/
   	public void setValHexB6True()  throws CFException{  			
    	out.setValHexB6True();
   	}
	/**
	 *	Test condition "?" for isValHex6f()
	 *	@return  Returns true if isValHex6f() is "?"
	 */
   public boolean isValHex6f() throws CFException {
      return out.isValHex6f();
   }

	/**
	*  set values "?"
	*/
   	public void setValHex6fTrue()  throws CFException{  			
    	out.setValHex6fTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xCC} for isValHexCc()
	 *	@return  Returns true if isValHexCc() is new byte[] {(byte)0xCC}
	 */
   public boolean isValHexCc() throws CFException {
      return out.isValHexCc();
   }

	/**
	*  set values new byte[] {(byte)0xCC}
	*/
   	public void setValHexCcTrue()  throws CFException{  			
    	out.setValHexCcTrue();
   	}
	/**
	 *	Test condition "." for isValHex4b()
	 *	@return  Returns true if isValHex4b() is "."
	 */
   public boolean isValHex4b() throws CFException {
      return out.isValHex4b();
   }

	/**
	*  set values "."
	*/
   	public void setValHex4bTrue()  throws CFException{  			
    	out.setValHex4bTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x8F} for isValHex8f()
	 *	@return  Returns true if isValHex8f() is new byte[] {(byte)0x8F}
	 */
   public boolean isValHex8f() throws CFException {
      return out.isValHex8f();
   }

	/**
	*  set values new byte[] {(byte)0x8F}
	*/
   	public void setValHex8fTrue()  throws CFException{  			
    	out.setValHex8fTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x16} for isValHex16()
	 *	@return  Returns true if isValHex16() is new byte[] {(byte)0x16}
	 */
   public boolean isValHex16() throws CFException {
      return out.isValHex16();
   }

	/**
	*  set values new byte[] {(byte)0x16}
	*/
   	public void setValHex16True()  throws CFException{  			
    	out.setValHex16True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x70} for isValHex70()
	 *	@return  Returns true if isValHex70() is new byte[] {(byte)0x70}
	 */
   public boolean isValHex70() throws CFException {
      return out.isValHex70();
   }

	/**
	*  set values new byte[] {(byte)0x70}
	*/
   	public void setValHex70True()  throws CFException{  			
    	out.setValHex70True();
   	}
	/**
	 *	Test condition "d" for isValHex84()
	 *	@return  Returns true if isValHex84() is "d"
	 */
   public boolean isValHex84() throws CFException {
      return out.isValHex84();
   }

	/**
	*  set values "d"
	*/
   	public void setValHex84True()  throws CFException{  			
    	out.setValHex84True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x27} for isValHex27()
	 *	@return  Returns true if isValHex27() is new byte[] {(byte)0x27}
	 */
   public boolean isValHex27() throws CFException {
      return out.isValHex27();
   }

	/**
	*  set values new byte[] {(byte)0x27}
	*/
   	public void setValHex27True()  throws CFException{  			
    	out.setValHex27True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xCF} for isValHexCf()
	 *	@return  Returns true if isValHexCf() is new byte[] {(byte)0xCF}
	 */
   public boolean isValHexCf() throws CFException {
      return out.isValHexCf();
   }

	/**
	*  set values new byte[] {(byte)0xCF}
	*/
   	public void setValHexCfTrue()  throws CFException{  			
    	out.setValHexCfTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x76} for isValHex76()
	 *	@return  Returns true if isValHex76() is new byte[] {(byte)0x76}
	 */
   public boolean isValHex76() throws CFException {
      return out.isValHex76();
   }

	/**
	*  set values new byte[] {(byte)0x76}
	*/
   	public void setValHex76True()  throws CFException{  			
    	out.setValHex76True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x79} for isValHex79()
	 *	@return  Returns true if isValHex79() is new byte[] {(byte)0x79}
	 */
   public boolean isValHex79() throws CFException {
      return out.isValHex79();
   }

	/**
	*  set values new byte[] {(byte)0x79}
	*/
   	public void setValHex79True()  throws CFException{  			
    	out.setValHex79True();
   	}
	/**
	 *	Test condition "|" for isValHex4f()
	 *	@return  Returns true if isValHex4f() is "|"
	 */
   public boolean isValHex4f() throws CFException {
      return out.isValHex4f();
   }

	/**
	*  set values "|"
	*/
   	public void setValHex4fTrue()  throws CFException{  			
    	out.setValHex4fTrue();
   	}
	/**
	 *	Returns the value of out
	 *	@return out
	 */   
	 public Out getOut() {
   	return out;
   }


	/**
	 *	Test condition "<" for isValHex4c()
	 *	@return  Returns true if isValHex4c() is "<"
	 */
   public boolean isValHex4c() throws CFException {
      return out.isValHex4c();
   }

	/**
	*  set values "<"
	*/
   	public void setValHex4cTrue()  throws CFException{  			
    	out.setValHex4cTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x30} for isValHex30()
	 *	@return  Returns true if isValHex30() is new byte[] {(byte)0x30}
	 */
   public boolean isValHex30() throws CFException {
      return out.isValHex30();
   }

	/**
	*  set values new byte[] {(byte)0x30}
	*/
   	public void setValHex30True()  throws CFException{  			
    	out.setValHex30True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x53} for isValHex53()
	 *	@return  Returns true if isValHex53() is new byte[] {(byte)0x53}
	 */
   public boolean isValHex53() throws CFException {
      return out.isValHex53();
   }

	/**
	*  set values new byte[] {(byte)0x53}
	*/
   	public void setValHex53True()  throws CFException{  			
    	out.setValHex53True();
   	}
	/**
	 *	Returns the value of byteWs
	 *	@return byteWs
	 */
   public char[] getByteWs() throws CFException  {              
   		return out.getByteWs();
   }

  
	/**
	*  set variable byteWs
	*  @param value
	**/
   public void setByteWs(char[] value) throws CFException {
      out.setByteWs(value);
   } 

     /**
	 * 	Update ByteWs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setByteWs(char[] source, int sourceIndex) throws CFException {
      out.setByteWs(source, sourceIndex);
   	
   }
   
   public void setByteWs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      out.setByteWs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ByteWs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setByteWs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      out.setByteWs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ByteWs with another Field
	 *	@param value
	 */
   public void setByteWs(Field source) {
      out.setByteWs(source);
   }  
   
     /**
	 * 	Update ByteWs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setByteWs(Field source, int sourceIndex,int sourceLen) {
      out.setByteWs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ByteWs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setByteWs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      out.setByteWs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition new byte[] {(byte)0xB2} for isValHexB2()
	 *	@return  Returns true if isValHexB2() is new byte[] {(byte)0xB2}
	 */
   public boolean isValHexB2() throws CFException {
      return out.isValHexB2();
   }

	/**
	*  set values new byte[] {(byte)0xB2}
	*/
   	public void setValHexB2True()  throws CFException{  			
    	out.setValHexB2True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x29} for isValHex29()
	 *	@return  Returns true if isValHex29() is new byte[] {(byte)0x29}
	 */
   public boolean isValHex29() throws CFException {
      return out.isValHex29();
   }

	/**
	*  set values new byte[] {(byte)0x29}
	*/
   	public void setValHex29True()  throws CFException{  			
    	out.setValHex29True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x6A} for isValHex6a()
	 *	@return  Returns true if isValHex6a() is new byte[] {(byte)0x6A}
	 */
   public boolean isValHex6a() throws CFException {
      return out.isValHex6a();
   }

	/**
	*  set values new byte[] {(byte)0x6A}
	*/
   	public void setValHex6aTrue()  throws CFException{  			
    	out.setValHex6aTrue();
   	}
	/**
	 *	Test condition "," for isValHex6b()
	 *	@return  Returns true if isValHex6b() is ","
	 */
   public boolean isValHex6b() throws CFException {
      return out.isValHex6b();
   }

	/**
	*  set values ","
	*/
   	public void setValHex6bTrue()  throws CFException{  			
    	out.setValHex6bTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xED} for isValHexEd()
	 *	@return  Returns true if isValHexEd() is new byte[] {(byte)0xED}
	 */
   public boolean isValHexEd() throws CFException {
      return out.isValHexEd();
   }

	/**
	*  set values new byte[] {(byte)0xED}
	*/
   	public void setValHexEdTrue()  throws CFException{  			
    	out.setValHexEdTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xB4} for isValHexB4()
	 *	@return  Returns true if isValHexB4() is new byte[] {(byte)0xB4}
	 */
   public boolean isValHexB4() throws CFException {
      return out.isValHexB4();
   }

	/**
	*  set values new byte[] {(byte)0xB4}
	*/
   	public void setValHexB4True()  throws CFException{  			
    	out.setValHexB4True();
   	}
	/**
	 *	Test condition "u" for isValHexA4()
	 *	@return  Returns true if isValHexA4() is "u"
	 */
   public boolean isValHexA4() throws CFException {
      return out.isValHexA4();
   }

	/**
	*  set values "u"
	*/
   	public void setValHexA4True()  throws CFException{  			
    	out.setValHexA4True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xA1} for isValHexA1()
	 *	@return  Returns true if isValHexA1() is new byte[] {(byte)0xA1}
	 */
   public boolean isValHexA1() throws CFException {
      return out.isValHexA1();
   }

	/**
	*  set values new byte[] {(byte)0xA1}
	*/
   	public void setValHexA1True()  throws CFException{  			
    	out.setValHexA1True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xCE} for isValHexCe()
	 *	@return  Returns true if isValHexCe() is new byte[] {(byte)0xCE}
	 */
   public boolean isValHexCe() throws CFException {
      return out.isValHexCe();
   }

	/**
	*  set values new byte[] {(byte)0xCE}
	*/
   	public void setValHexCeTrue()  throws CFException{  			
    	out.setValHexCeTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x33} for isValHex33()
	 *	@return  Returns true if isValHex33() is new byte[] {(byte)0x33}
	 */
   public boolean isValHex33() throws CFException {
      return out.isValHex33();
   }

	/**
	*  set values new byte[] {(byte)0x33}
	*/
   	public void setValHex33True()  throws CFException{  			
    	out.setValHex33True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x62} for isValHex62()
	 *	@return  Returns true if isValHex62() is new byte[] {(byte)0x62}
	 */
   public boolean isValHex62() throws CFException {
      return out.isValHex62();
   }

	/**
	*  set values new byte[] {(byte)0x62}
	*/
   	public void setValHex62True()  throws CFException{  			
    	out.setValHex62True();
   	}
	/**
	 *	Test condition "h" for isValHex88()
	 *	@return  Returns true if isValHex88() is "h"
	 */
   public boolean isValHex88() throws CFException {
      return out.isValHex88();
   }

	/**
	*  set values "h"
	*/
   	public void setValHex88True()  throws CFException{  			
    	out.setValHex88True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x14} for isValHex14()
	 *	@return  Returns true if isValHex14() is new byte[] {(byte)0x14}
	 */
   public boolean isValHex14() throws CFException {
      return out.isValHex14();
   }

	/**
	*  set values new byte[] {(byte)0x14}
	*/
   	public void setValHex14True()  throws CFException{  			
    	out.setValHex14True();
   	}
	/**
	 *	Test condition "e" for isValHex85()
	 *	@return  Returns true if isValHex85() is "e"
	 */
   public boolean isValHex85() throws CFException {
      return out.isValHex85();
   }

	/**
	*  set values "e"
	*/
   	public void setValHex85True()  throws CFException{  			
    	out.setValHex85True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x2C} for isValHex2c()
	 *	@return  Returns true if isValHex2c() is new byte[] {(byte)0x2C}
	 */
   public boolean isValHex2c() throws CFException {
      return out.isValHex2c();
   }

	/**
	*  set values new byte[] {(byte)0x2C}
	*/
   	public void setValHex2cTrue()  throws CFException{  			
    	out.setValHex2cTrue();
   	}
	/**
	 *	Test condition "F" for isValHexC6()
	 *	@return  Returns true if isValHexC6() is "F"
	 */
   public boolean isValHexC6() throws CFException {
      return out.isValHexC6();
   }

	/**
	*  set values "F"
	*/
   	public void setValHexC6True()  throws CFException{  			
    	out.setValHexC6True();
   	}
	/**
	 *	Test condition "g" for isValHex87()
	 *	@return  Returns true if isValHex87() is "g"
	 */
   public boolean isValHex87() throws CFException {
      return out.isValHex87();
   }

	/**
	*  set values "g"
	*/
   	public void setValHex87True()  throws CFException{  			
    	out.setValHex87True();
   	}
	/**
	 *	Test condition "N" for isValHexD5()
	 *	@return  Returns true if isValHexD5() is "N"
	 */
   public boolean isValHexD5() throws CFException {
      return out.isValHexD5();
   }

	/**
	*  set values "N"
	*/
   	public void setValHexD5True()  throws CFException{  			
    	out.setValHexD5True();
   	}
	/**
	 *	Returns the value of outputRec
	 *	@return outputRec
	 */   
	 public OutputRec getOutputRec() {
   	return outputRec;
   }


	/**
	 *	Test condition new byte[] {(byte)0x9F} for isValHex9f()
	 *	@return  Returns true if isValHex9f() is new byte[] {(byte)0x9F}
	 */
   public boolean isValHex9f() throws CFException {
      return out.isValHex9f();
   }

	/**
	*  set values new byte[] {(byte)0x9F}
	*/
   	public void setValHex9fTrue()  throws CFException{  			
    	out.setValHex9fTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xDA} for isValHexDa()
	 *	@return  Returns true if isValHexDa() is new byte[] {(byte)0xDA}
	 */
   public boolean isValHexDa() throws CFException {
      return out.isValHexDa();
   }

	/**
	*  set values new byte[] {(byte)0xDA}
	*/
   	public void setValHexDaTrue()  throws CFException{  			
    	out.setValHexDaTrue();
   	}
	/**
	 *	Test condition "M" for isValHexD4()
	 *	@return  Returns true if isValHexD4() is "M"
	 */
   public boolean isValHexD4() throws CFException {
      return out.isValHexD4();
   }

	/**
	*  set values "M"
	*/
   	public void setValHexD4True()  throws CFException{  			
    	out.setValHexD4True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x37} for isValHex37()
	 *	@return  Returns true if isValHex37() is new byte[] {(byte)0x37}
	 */
   public boolean isValHex37() throws CFException {
      return out.isValHex37();
   }

	/**
	*  set values new byte[] {(byte)0x37}
	*/
   	public void setValHex37True()  throws CFException{  			
    	out.setValHex37True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x1D} for isValHex1d()
	 *	@return  Returns true if isValHex1d() is new byte[] {(byte)0x1D}
	 */
   public boolean isValHex1d() throws CFException {
      return out.isValHex1d();
   }

	/**
	*  set values new byte[] {(byte)0x1D}
	*/
   	public void setValHex1dTrue()  throws CFException{  			
    	out.setValHex1dTrue();
   	}
	/**
	 *	Test condition "Q" for isValHexD8()
	 *	@return  Returns true if isValHexD8() is "Q"
	 */
   public boolean isValHexD8() throws CFException {
      return out.isValHexD8();
   }

	/**
	*  set values "Q"
	*/
   	public void setValHexD8True()  throws CFException{  			
    	out.setValHexD8True();
   	}
	/**
	 *	Test condition "%" for isValHex6c()
	 *	@return  Returns true if isValHex6c() is "%"
	 */
   public boolean isValHex6c() throws CFException {
      return out.isValHex6c();
   }

	/**
	*  set values "%"
	*/
   	public void setValHex6cTrue()  throws CFException{  			
    	out.setValHex6cTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x1E} for isValHex1e()
	 *	@return  Returns true if isValHex1e() is new byte[] {(byte)0x1E}
	 */
   public boolean isValHex1e() throws CFException {
      return out.isValHex1e();
   }

	/**
	*  set values new byte[] {(byte)0x1E}
	*/
   	public void setValHex1eTrue()  throws CFException{  			
    	out.setValHex1eTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x69} for isValHex69()
	 *	@return  Returns true if isValHex69() is new byte[] {(byte)0x69}
	 */
   public boolean isValHex69() throws CFException {
      return out.isValHex69();
   }

	/**
	*  set values new byte[] {(byte)0x69}
	*/
   	public void setValHex69True()  throws CFException{  			
    	out.setValHex69True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x1B} for isValHex1b()
	 *	@return  Returns true if isValHex1b() is new byte[] {(byte)0x1B}
	 */
   public boolean isValHex1b() throws CFException {
      return out.isValHex1b();
   }

	/**
	*  set values new byte[] {(byte)0x1B}
	*/
   	public void setValHex1bTrue()  throws CFException{  			
    	out.setValHex1bTrue();
   	}
	/**
	 *	Test condition "C" for isValHexC3()
	 *	@return  Returns true if isValHexC3() is "C"
	 */
   public boolean isValHexC3() throws CFException {
      return out.isValHexC3();
   }

	/**
	*  set values "C"
	*/
   	public void setValHexC3True()  throws CFException{  			
    	out.setValHexC3True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x50} for isValHex50()
	 *	@return  Returns true if isValHex50() is new byte[] {(byte)0x50}
	 */
   public boolean isValHex50() throws CFException {
      return out.isValHex50();
   }

	/**
	*  set values new byte[] {(byte)0x50}
	*/
   	public void setValHex50True()  throws CFException{  			
    	out.setValHex50True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x0B} for isValHex0b()
	 *	@return  Returns true if isValHex0b() is new byte[] {(byte)0x0B}
	 */
   public boolean isValHex0b() throws CFException {
      return out.isValHex0b();
   }

	/**
	*  set values new byte[] {(byte)0x0B}
	*/
   	public void setValHex0bTrue()  throws CFException{  			
    	out.setValHex0bTrue();
   	}
	/**
	 *	Test condition "'" for isValHex7d()
	 *	@return  Returns true if isValHex7d() is "'"
	 */
   public boolean isValHex7d() throws CFException {
      return out.isValHex7d();
   }

	/**
	*  set values "'"
	*/
   	public void setValHex7dTrue()  throws CFException{  			
    	out.setValHex7dTrue();
   	}

        public TstcdpagCtx getTstcdpagCtx() {
            return TstcdpagCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inputRec.hashCode();
        str += outputRec.hashCode();
        str += miscData.hashCode();
        str += out.hashCode();
       return str.hashCode();
    }

    public ProcessOutputOutCtx clone() {
        ProcessOutputOutCtx cloneObj = new ProcessOutputOutCtx();
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.out = new Out();
        cloneObj.out.set(out.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutputOutCtx getProcessOutputOutCtx() {
            return new ProcessOutputOutCtx();
    }
}
