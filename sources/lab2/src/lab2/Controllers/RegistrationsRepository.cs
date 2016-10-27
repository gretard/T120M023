using lab2.Models;
using System.Collections.Concurrent;
using System.Collections.Generic;

namespace lab2.Controllers
{

    public static class RegistrationsRepository
    {

       public static ConcurrentStack<RegisterModel> Registrations = new ConcurrentStack<RegisterModel>();


    }
}