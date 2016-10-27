using lab2.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace lab2.Controllers
{
    public class RegisterController : Controller
    {


        public ActionResult Create()
        {
            return View("Create");
        }

        public ActionResult Index()
        {
            return View("Index", RegistrationsRepository.Registrations);
        }

        [HttpGet]
        public ActionResult Clear()
        {
            RegistrationsRepository.Registrations.Clear();
            return RedirectToAction("Index");
        }
    }
}
