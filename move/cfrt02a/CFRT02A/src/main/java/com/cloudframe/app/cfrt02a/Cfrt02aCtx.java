package com.cloudframe.app.cfrt02a;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfrt02a.dto.Work;


@Context
public class Cfrt02aCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;


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


    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public Cfrt02aCtx clone() {
        Cfrt02aCtx cloneObj = new Cfrt02aCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProgramBeginInCtx implements Cloneable {
     Work work = Cfrt02aCtx.this.getWork();

	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public short getSub() throws CFException {        
   		return work.getSub();
	}
	
	/**
	 * 	Update Sub with the passed value
	 *	@param number
	 */
	public void setSub(short number)  throws CFException{
		work.setSub(number);
	}

	public void setSub(int number)  throws CFException{
		work.setSub((short)number);
	}

	public void setSub(long number)  throws CFException{
		work.setSub((short)number);
	}



	/**
	 *	Returns the value of inx
	 *	@return inx
	 */
	public int getInx() throws CFException {
   		return work.getInx();
	}


	/**
	 *	Returns String value of inx
	 *	@return inx
	 */
	public char[]  getInxString() throws CFException {
	     return String.valueOf(work.getInxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inxIsNumeric()  throws CFException{
	    return work.inxIsNumeric();
	}

	/**
	 * 	Update Inx with the passed value
	 *	@param number
	 */
	public void setInx(int number)  throws CFException{
		work.setInx(number);
	}
	

	public void setInx(long number)  throws CFException{
	    work.setInx(number);
	}
	
	
	/**
	 * 	Update Inx with the passed value
	 *	@param value (String or char[])
	 */
	public void setInx(char[] value)  throws CFException {
		work.setInx(value);
	}
	
	/**
	 * 	Update Inx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInxString(char[] value)  throws CFException{
		work.setInx(value);
	}	


        public Cfrt02aCtx getCfrt02aCtx() {
            return Cfrt02aCtx.this;
        }

        public ProgramBeginOutCtx getProgramBeginOutCtx() {
            return new ProgramBeginOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public ProgramBeginInCtx clone() {
        ProgramBeginInCtx cloneObj = new ProgramBeginInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProgramBeginInCtx getProgramBeginInCtx() {
            return new ProgramBeginInCtx();
    }
     public class ProgramBeginOutCtx implements Cloneable {
     Work work = Cfrt02aCtx.this.getWork();

	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public short getSub() throws CFException {        
   		return work.getSub();
	}
	
	/**
	 * 	Update Sub with the passed value
	 *	@param number
	 */
	public void setSub(short number)  throws CFException{
		work.setSub(number);
	}

	public void setSub(int number)  throws CFException{
		work.setSub((short)number);
	}

	public void setSub(long number)  throws CFException{
		work.setSub((short)number);
	}



	/**
	 *	Returns the value of theNumber
	 *	@return theNumber
	 */
	public int getTheNumber() throws CFException {
   		return work.getTheNumber();
	}


	/**
	 *	Returns String value of theNumber
	 *	@return theNumber
	 */
	public char[]  getTheNumberString() throws CFException {
	     return String.valueOf(work.getTheNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean theNumberIsNumeric()  throws CFException{
	    return work.theNumberIsNumeric();
	}

	/**
	 * 	Update TheNumber with the passed value
	 *	@param number
	 */
	public void setTheNumber(int number)  throws CFException{
		work.setTheNumber(number);
	}
	

	public void setTheNumber(long number)  throws CFException{
	    work.setTheNumber(number);
	}
	
	
	/**
	 * 	Update TheNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setTheNumber(char[] value)  throws CFException {
		work.setTheNumber(value);
	}
	
	/**
	 * 	Update TheNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTheNumberString(char[] value)  throws CFException{
		work.setTheNumber(value);
	}	

	/**
	 *	Returns the value of theDisplay
	 *	@return theDisplay
	 */
   public char[] getTheDisplay() throws CFException  {              
   		return work.getTheDisplay();
   }

  
	/**
	*  set variable theDisplay
	*  @param value
	**/
   public void setTheDisplay(char[] value) throws CFException {
      work.setTheDisplay(value);
   } 

	/**
	 *	Returns the value of inx
	 *	@return inx
	 */
	public int getInx() throws CFException {
   		return work.getInx();
	}


	/**
	 *	Returns String value of inx
	 *	@return inx
	 */
	public char[]  getInxString() throws CFException {
	     return String.valueOf(work.getInxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inxIsNumeric()  throws CFException{
	    return work.inxIsNumeric();
	}

	/**
	 * 	Update Inx with the passed value
	 *	@param number
	 */
	public void setInx(int number)  throws CFException{
		work.setInx(number);
	}
	

	public void setInx(long number)  throws CFException{
	    work.setInx(number);
	}
	
	
	/**
	 * 	Update Inx with the passed value
	 *	@param value (String or char[])
	 */
	public void setInx(char[] value)  throws CFException {
		work.setInx(value);
	}
	
	/**
	 * 	Update Inx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInxString(char[] value)  throws CFException{
		work.setInx(value);
	}	

	/**
	 *	Returns the value of aSpace
	 *	@return aSpace
	 */
   public char[] getASpace() throws CFException  {              
   		return work.getASpace();
   }

  
	/**
	*  set variable aSpace
	*  @param value
	**/
   public void setASpace(char[] value) throws CFException {
      work.setASpace(value);
   } 

	/**
	 *	Returns the value of theMessage
	 *	@return theMessage
	 */
   public char[] getTheMessage() throws CFException  {              
   		return work.getTheMessage();
   }

  
	/**
	*  set variable theMessage
	*  @param value
	**/
   public void setTheMessage(char[] value) throws CFException {
      work.setTheMessage(value);
   } 


        public Cfrt02aCtx getCfrt02aCtx() {
            return Cfrt02aCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public ProgramBeginOutCtx clone() {
        ProgramBeginOutCtx cloneObj = new ProgramBeginOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProgramBeginOutCtx getProgramBeginOutCtx() {
            return new ProgramBeginOutCtx();
    }
     public class AddTheNumberInCtx implements Cloneable {
     Work work = Cfrt02aCtx.this.getWork();

	/**
	 *	Returns the value of theNumber
	 *	@return theNumber
	 */
	public int getTheNumber() throws CFException {
   		return work.getTheNumber();
	}


	/**
	 *	Returns String value of theNumber
	 *	@return theNumber
	 */
	public char[]  getTheNumberString() throws CFException {
	     return String.valueOf(work.getTheNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean theNumberIsNumeric()  throws CFException{
	    return work.theNumberIsNumeric();
	}

	/**
	 * 	Update TheNumber with the passed value
	 *	@param number
	 */
	public void setTheNumber(int number)  throws CFException{
		work.setTheNumber(number);
	}
	

	public void setTheNumber(long number)  throws CFException{
	    work.setTheNumber(number);
	}
	
	
	/**
	 * 	Update TheNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setTheNumber(char[] value)  throws CFException {
		work.setTheNumber(value);
	}
	
	/**
	 * 	Update TheNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTheNumberString(char[] value)  throws CFException{
		work.setTheNumber(value);
	}	


        public Cfrt02aCtx getCfrt02aCtx() {
            return Cfrt02aCtx.this;
        }

        public AddTheNumberOutCtx getAddTheNumberOutCtx() {
            return new AddTheNumberOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public AddTheNumberInCtx clone() {
        AddTheNumberInCtx cloneObj = new AddTheNumberInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AddTheNumberInCtx getAddTheNumberInCtx() {
            return new AddTheNumberInCtx();
    }
     public class AddTheNumberOutCtx implements Cloneable {
     Work work = Cfrt02aCtx.this.getWork();

	/**
	 *	Returns the value of theNumber
	 *	@return theNumber
	 */
	public int getTheNumber() throws CFException {
   		return work.getTheNumber();
	}


	/**
	 *	Returns String value of theNumber
	 *	@return theNumber
	 */
	public char[]  getTheNumberString() throws CFException {
	     return String.valueOf(work.getTheNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean theNumberIsNumeric()  throws CFException{
	    return work.theNumberIsNumeric();
	}

	/**
	 * 	Update TheNumber with the passed value
	 *	@param number
	 */
	public void setTheNumber(int number)  throws CFException{
		work.setTheNumber(number);
	}
	

	public void setTheNumber(long number)  throws CFException{
	    work.setTheNumber(number);
	}
	
	
	/**
	 * 	Update TheNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setTheNumber(char[] value)  throws CFException {
		work.setTheNumber(value);
	}
	
	/**
	 * 	Update TheNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTheNumberString(char[] value)  throws CFException{
		work.setTheNumber(value);
	}	


        public Cfrt02aCtx getCfrt02aCtx() {
            return Cfrt02aCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public AddTheNumberOutCtx clone() {
        AddTheNumberOutCtx cloneObj = new AddTheNumberOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AddTheNumberOutCtx getAddTheNumberOutCtx() {
            return new AddTheNumberOutCtx();
    }
     public class DisplayTheMessageInCtx implements Cloneable {
     Work work = Cfrt02aCtx.this.getWork();

	/**
	 *	Returns the value of theNumber
	 *	@return theNumber
	 */
	public int getTheNumber() throws CFException {
   		return work.getTheNumber();
	}


	/**
	 *	Returns String value of theNumber
	 *	@return theNumber
	 */
	public char[]  getTheNumberString() throws CFException {
	     return String.valueOf(work.getTheNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean theNumberIsNumeric()  throws CFException{
	    return work.theNumberIsNumeric();
	}

	/**
	 * 	Update TheNumber with the passed value
	 *	@param number
	 */
	public void setTheNumber(int number)  throws CFException{
		work.setTheNumber(number);
	}
	

	public void setTheNumber(long number)  throws CFException{
	    work.setTheNumber(number);
	}
	
	
	/**
	 * 	Update TheNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setTheNumber(char[] value)  throws CFException {
		work.setTheNumber(value);
	}
	
	/**
	 * 	Update TheNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTheNumberString(char[] value)  throws CFException{
		work.setTheNumber(value);
	}	

	/**
	 *	Returns the value of aSpace
	 *	@return aSpace
	 */
   public char[] getASpace() throws CFException  {              
   		return work.getASpace();
   }

  
	/**
	*  set variable aSpace
	*  @param value
	**/
   public void setASpace(char[] value) throws CFException {
      work.setASpace(value);
   } 

	/**
	 *	Returns the value of start
	 *	@return start
	 */
	public short getStart() throws CFException {        
   		return work.getStart();
	}
	
	/**
	 * 	Update Start with the passed value
	 *	@param number
	 */
	public void setStart(short number)  throws CFException{
		work.setStart(number);
	}

	public void setStart(int number)  throws CFException{
		work.setStart((short)number);
	}

	public void setStart(long number)  throws CFException{
		work.setStart((short)number);
	}



	/**
	 *	Returns the value of theMessage
	 *	@return theMessage
	 */
   public char[] getTheMessage() throws CFException  {              
   		return work.getTheMessage();
   }

  
	/**
	*  set variable theMessage
	*  @param value
	**/
   public void setTheMessage(char[] value) throws CFException {
      work.setTheMessage(value);
   } 


        public Cfrt02aCtx getCfrt02aCtx() {
            return Cfrt02aCtx.this;
        }

        public DisplayTheMessageOutCtx getDisplayTheMessageOutCtx() {
            return new DisplayTheMessageOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayTheMessageInCtx clone() {
        DisplayTheMessageInCtx cloneObj = new DisplayTheMessageInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayTheMessageInCtx getDisplayTheMessageInCtx() {
            return new DisplayTheMessageInCtx();
    }
     public class DisplayTheMessageOutCtx implements Cloneable {
     Work work = Cfrt02aCtx.this.getWork();

	/**
	 *	Returns the value of theDisplay
	 *	@return theDisplay
	 */
   public char[] getTheDisplay() throws CFException  {              
   		return work.getTheDisplay();
   }

  
	/**
	*  set variable theDisplay
	*  @param value
	**/
   public void setTheDisplay(char[] value) throws CFException {
      work.setTheDisplay(value);
   } 

	/**
	 *	Returns the value of stage
	 *	@return stage
	 */
   public char[] getStage() throws CFException  {              
   		return work.getStage();
   }

  
	/**
	*  set variable stage
	*  @param value
	**/
   public void setStage(char[] value) throws CFException {
      work.setStage(value);
   } 

	/**
	 *	Returns the value of start
	 *	@return start
	 */
	public short getStart() throws CFException {        
   		return work.getStart();
	}
	
	/**
	 * 	Update Start with the passed value
	 *	@param number
	 */
	public void setStart(short number)  throws CFException{
		work.setStart(number);
	}

	public void setStart(int number)  throws CFException{
		work.setStart((short)number);
	}

	public void setStart(long number)  throws CFException{
		work.setStart((short)number);
	}




        public Cfrt02aCtx getCfrt02aCtx() {
            return Cfrt02aCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayTheMessageOutCtx clone() {
        DisplayTheMessageOutCtx cloneObj = new DisplayTheMessageOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayTheMessageOutCtx getDisplayTheMessageOutCtx() {
            return new DisplayTheMessageOutCtx();
    }
}
