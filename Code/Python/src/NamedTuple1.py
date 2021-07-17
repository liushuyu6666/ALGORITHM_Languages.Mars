from collections import namedtuple
from functools import reduce
from itertools import chain
from operator import add


def merge(*records):
    """
    :param records: (varargs list of namedtuple) The patient details.
    :returns: (namedtuple) named Patient, containing details from all records, in entry order.
    """
    # attr_dict = {}
    # for arg in records:
    #     for field in arg._fields:
    #         attr_dict[field] = getattr(arg, field)
    # Patient = namedtuple('Patient', [field for field in attr_dict.keys()])
    # return Patient(*chain(attr_dict))

    


PersonalDetails = namedtuple('PersonalDetails', ['date_of_birth'])
personal_details = PersonalDetails(date_of_birth='06-04-1972')

Complexion = namedtuple('Complexion', ['eye_color', 'hair_color'])
complexion = Complexion(eye_color='Blue', hair_color='Black')

# print(getattr(complexion, 'eye_color'))

print(merge(personal_details, complexion))