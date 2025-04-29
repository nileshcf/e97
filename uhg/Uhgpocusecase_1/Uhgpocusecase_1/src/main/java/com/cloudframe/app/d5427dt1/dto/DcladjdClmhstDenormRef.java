package com.cloudframe.app.d5427dt1.dto;

/**
*  The class DcladjdClmhstDenormRef is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DcladjdClmhstDenormRef extends DcladjdClmhstDenormRefSerialized {
   
				@Getter @Setter private DderefInvnCtlNbrGroup dderefInvnCtlNbrGroup = new DderefInvnCtlNbrGroup();
				@Getter @Setter private DderefIcnSufxCdGroup dderefIcnSufxCdGroup = new DderefIcnSufxCdGroup();
				@Getter @Setter private DderefProcDtGroup dderefProcDtGroup = new DderefProcDtGroup();
				@Getter @Setter private DderefProcTmGroup dderefProcTmGroup = new DderefProcTmGroup();

								@Getter @Setter private short dderefIcnSufxVersNbr;
				@Getter @Setter private DderefLnIdGroup dderefLnIdGroup = new DderefLnIdGroup();
				@Getter @Setter private DderefDepnNbrGroup dderefDepnNbrGroup = new DderefDepnNbrGroup();
				@Getter @Setter private DderefEeIdGroup dderefEeIdGroup = new DderefEeIdGroup();
				@Getter @Setter private DderefPgmIdLstCharValGroup dderefPgmIdLstCharValGroup = new DderefPgmIdLstCharValGroup();
				@Getter @Setter private DderefPolNbrGroup dderefPolNbrGroup = new DderefPolNbrGroup();
	
	/**
	* Constructor for DcladjdClmhstDenormRef
	**/
    public DcladjdClmhstDenormRef() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDderefInvnCtlNbrGroup().setParent(this,getStartOffset() + 12);
					getDderefIcnSufxCdGroup().setParent(this,getStartOffset() + 22);
					getDderefProcDtGroup().setParent(this,getStartOffset() + 24);
					getDderefProcTmGroup().setParent(this,getStartOffset() + 34);
					getDderefLnIdGroup().setParent(this,getStartOffset() + 44);
					getDderefDepnNbrGroup().setParent(this,getStartOffset() + 87);
					getDderefEeIdGroup().setParent(this,getStartOffset() + 110);
					getDderefPgmIdLstCharValGroup().setParent(this,getStartOffset() + 227);
					getDderefPolNbrGroup().setParent(this,getStartOffset() + 238);
	   	/*  end of offset */
    }





}
  
