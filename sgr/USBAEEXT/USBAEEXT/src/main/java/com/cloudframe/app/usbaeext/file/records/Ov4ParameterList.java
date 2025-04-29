package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4ParameterList is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ov4ParameterList extends Ov4ParameterListSerialized {
   

								@Getter @Setter private int ov4BankNo;

								@Getter @Setter private int ov4DeptNo;
				@Getter @Setter private Ov4ItemNo ov4ItemNo = new Ov4ItemNo();
				@Getter @Setter private Ov4V4BaseInfo ov4V4BaseInfo = new Ov4V4BaseInfo();
				@Getter @Setter private Ov4CpcsInfo ov4CpcsInfo = new Ov4CpcsInfo();
				@Getter @Setter private Ov4MicrLineInfo ov4MicrLineInfo = new Ov4MicrLineInfo();
				@Getter @Setter private Ov4AdjustmentAmount ov4AdjustmentAmount = new Ov4AdjustmentAmount();
				@Getter @Setter private Ov4IncomingCashLetterInfo ov4IncomingCashLetterInfo = new Ov4IncomingCashLetterInfo();
				@Getter @Setter private Ov4MiscData1 ov4MiscData1 = new Ov4MiscData1();
				@Getter @Setter private Ov4MiscData2 ov4MiscData2 = new Ov4MiscData2();
	
	/**
	* Constructor for Ov4ParameterList
	**/
    public Ov4ParameterList() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getOv4ItemNo().setParent(this,getStartOffset() + 5);
					getOv4V4BaseInfo().setParent(this,getStartOffset() + 15);
					getOv4CpcsInfo().setParent(this,getStartOffset() + 73);
					getOv4MicrLineInfo().setParent(this,getStartOffset() + 125);
					getOv4AdjustmentAmount().setParent(this,getStartOffset() + 192);
					getOv4IncomingCashLetterInfo().setParent(this,getStartOffset() + 211);
					getOv4MiscData1().setParent(this,getStartOffset() + 375);
					getOv4MiscData2().setParent(this,getStartOffset() + 425);
	   	/*  end of offset */
    }





}
  
