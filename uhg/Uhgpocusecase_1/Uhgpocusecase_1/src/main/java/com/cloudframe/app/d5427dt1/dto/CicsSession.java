package com.cloudframe.app.d5427dt1.dto;

/**
*  The class CicsSession is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CicsSession extends CicsSessionSerialized {
   

								@Getter @Setter private int eibtime;

								@Getter @Setter private int eibdate;

						@Getter @Setter private char[] eibtrnid = Field.fillLowValue(4);

								@Getter @Setter private int eibtaskn;

						@Getter @Setter private char[] eibtrmid = Field.fillLowValue(4);

								@Getter @Setter private short dfheigdi;

								@Getter @Setter private short eibcposn;

								@Getter @Setter private short eibcalen;

						@Getter @Setter private char[] eibaid = Field.fillLowValue(1);

						@Getter @Setter private char[] eibfn = Field.fillLowValue(2);

						@Getter @Setter private char[] eibrcode = Field.fillLowValue(6);

						@Getter @Setter private char[] eibds = Field.fillLowValue(8);

						@Getter @Setter private char[] eibreqid = Field.fillLowValue(8);

						@Getter @Setter private char[] eibrsrce = Field.fillLowValue(8);

						@Getter @Setter private char[] eibsync = Field.fillLowValue(1);

						@Getter @Setter private char[] eibfree = Field.fillLowValue(1);

						@Getter @Setter private char[] eibrecv = Field.fillLowValue(1);

						@Getter @Setter private char[] eibfil01 = Field.fillLowValue(1);

						@Getter @Setter private char[] eibatt = Field.fillLowValue(1);

						@Getter @Setter private char[] eibeoc = Field.fillLowValue(1);

						@Getter @Setter private char[] eibfmh = Field.fillLowValue(1);

						@Getter @Setter private char[] eibcompl = Field.fillLowValue(1);

						@Getter @Setter private char[] eibsig = Field.fillLowValue(1);

						@Getter @Setter private char[] eibconf = Field.fillLowValue(1);

						@Getter @Setter private char[] eiberr = Field.fillLowValue(1);

						@Getter @Setter private char[] eiberrcd = Field.fillLowValue(4);

						@Getter @Setter private char[] eibsynrb = Field.fillLowValue(1);

						@Getter @Setter private char[] eibnodat = Field.fillLowValue(1);

								@Getter @Setter private int eibresp;

								@Getter @Setter private int eibresp2;

						@Getter @Setter private char[] eibrldbk = Field.fillLowValue(1);
	
	/**
	* Constructor for CicsSession
	**/
    public CicsSession() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
