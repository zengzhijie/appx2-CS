package com.dreawer.shopcenter.form;

import org.hibernate.validator.constraints.NotEmpty;

import static com.dreawer.shopcenter.MessageConstants.VAL_ENTERPRISE_ID_EMPTY;

public class AddCertificateForm extends BaseCertificateForm{
	
	@NotEmpty(message=VAL_ENTERPRISE_ID_EMPTY)
    private String enterpriseId = null;  //店铺id

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
}
