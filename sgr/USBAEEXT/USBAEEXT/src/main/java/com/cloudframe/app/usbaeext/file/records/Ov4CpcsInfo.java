package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4CpcsInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ov4CpcsInfo extends Ov4CpcsInfoSerialized { 
   

								@Getter @Setter private long ov4CycleDate;
				@Getter @Setter private Ov4CycleDateRedefined ov4CycleDateRedefined = new Ov4CycleDateRedefined();

						@Getter @Setter private char[] ov4CycleNo = Field.fillLowValue(2);

								@Getter @Setter private int ov4EntryNumber;

								@Getter @Setter private int ov4TrcrNo;

								@Getter @Setter private int ov4BlkNo;

								@Getter @Setter private long ov4SeqNo;

	
	/**
	* Constructor for Ov4CpcsInfo
	**/
    public Ov4CpcsInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ov4CpcsInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4CpcsInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getOv4CycleDateRedefined().setParent(this,getStartOffset() + 0);
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 32
             ,20
             );
    } 



}
  
