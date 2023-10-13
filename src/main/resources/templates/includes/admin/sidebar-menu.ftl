<div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">
    <a href="/admin-dashboard"
       class="d-flex align-items-center pb-3 mb-md-0 me-md-auto text-white text-decoration-none">
        <span class="fs-5 d-none d-sm-inline">Menu</span>
    </a>
    <ul class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-md-start" id="menu">
        <li class="nav-item">
            <a href="#" class="nav-link px-0  align-middle text-white">
                <i class="fs-4 bi-house"></i> <span class="ms-1 d-none d-sm-inline">Home</span>
            </a>
        </li>
        <li>
            <a href="#" class="nav-link px-0  align-middle text-white">
                <i class="fs-4 bi-speedometer2"></i> <span class="ms-1 d-none d-sm-inline">Dashboard</span>
            </a>
        </li>

        <li>
            <a href="#" class="nav-link px-0 align-middle text-white">
                <i class="fs-4 bi-table"></i> <span class="ms-1 d-none d-sm-inline">Orders</span>
            </a>
        </li>

        <li>
        <li class="">
            <a href="#" class="nav-link px-0 align-middle text-white">
                <i class="fs-4 bi-grid"></i> <span class="ms-1 d-none d-sm-inline">Products</span>
            </a>
        </li>
        <li>
            <a href="#" class="nav-link px-0 align-middle text-white">
                <i class="fs-4 bi-people"></i> <span class="ms-1 d-none d-sm-inline">Customers</span> </a>
        </li>
    </ul>
    <hr>
    <div class="dropdown pb-4">
        <a href="#" class="d-flex align-items-center text-white text-decoration-none dropdown-toggle"
           id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
            <img src="${userProfile.imgPath}" alt="hugenerd" width="60" height="60"
                 class="rounded-circle">
            <span class="d-none d-sm-inline mx-1">Admin User</span>
        </a>
        <ul class="dropdown-menu dropdown-menu-dark text-small shadow">
            <li><a class="dropdown-item" href="#">Settings</a></li>
            <li><a class="dropdown-item" href="/user/profile">Profile</a></li>
            <li>
                <hr class="dropdown-divider">
            </li>
            <li>
                <button id="logoutLink" class="dropdown-item">Sign out</button>
            </li>
        </ul>
    </div>
</div>