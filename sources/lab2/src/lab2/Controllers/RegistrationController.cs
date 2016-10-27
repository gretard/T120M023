using lab2.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web.Http;

namespace lab2.Controllers
{
    public class RegistrationController : ApiController
    {
  
        public IEnumerable<RegisterModel> Get()
        {
            return RegistrationsRepository.Registrations;
        }


        public RegisterModel Get(Guid id)
        {
            return RegistrationsRepository.Registrations.FirstOrDefault(x => x.Id == id);
        }


        public IHttpActionResult Post(RegisterModel view)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest("Please check values");
            }

            if (RegistrationsRepository.Registrations.Any(x=>string.Equals(x.Email, view.Email, StringComparison.OrdinalIgnoreCase))) {
                return BadRequest("Already registered");
            }

            view.Id = Guid.NewGuid();
            RegistrationsRepository.Registrations.Push(view);
            return Ok(view);
        }
    }
}
