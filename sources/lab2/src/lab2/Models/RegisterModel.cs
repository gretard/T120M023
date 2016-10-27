using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace lab2.Models
{
    public class RegisterModel
    {
        [Required]
        public string Name { get; set; }
        
        public Guid Id { get; set; }

        [Required]
        [EmailAddress]
        public string Email { get; set; }
    }
}