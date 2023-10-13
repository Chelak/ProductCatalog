    <div class="row">
        <div class="col-md-3 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5">
                <img class="rounded-circle mt-5" width="150px" src="${userProfile.imgPath}">
                <span class="font-weight-bold">${userProfile.firstName}</span>
                <span class="text-black-50">${userProfile.userName}</span>
            </div>
        </div>

        <div class="col-md-5 border-right">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Profile Settings</h4>
                </div>
                <input type="hidden"  value="${userProfile.userId}"/>
                <div class="row mt-2">
                    <div class="col-md-6">
                        <label class="labels">Name</label>
                        <input type="text" class="form-control" placeholder="first name" value="${userProfile.firstName}">
                    </div>
                    <div class="col-md-6">
                        <label class="labels">Surname</label>
                        <input type="text" class="form-control" placeholder="surname" value="${userProfile.lastName}" >
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-12">
                        <label class="labels">Mobile Number</label>
                        <input type="text" class="form-control" placeholder="enter phone number" value="${userProfile.phoneNumber}">
                    </div>
                    <div class="col-md-12">
                        <label class="labels">Address Line 1</label>
                        <input type="text" class="form-control" placeholder="enter address line 1" value="${userProfile.address}">
                    </div>
                </div>

                <div class="mt-5 text-center">
                    <button class="btn btn-primary profile-button" type="button">Save Profile</button>
                </div>
            </div>
        </div>
    </div>
